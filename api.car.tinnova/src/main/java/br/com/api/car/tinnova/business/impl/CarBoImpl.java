package br.com.api.car.tinnova.business.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.car.tinnova.business.CarBo;
import br.com.api.car.tinnova.model.BaseResponse;
import br.com.api.car.tinnova.model.Car;
import br.com.api.car.tinnova.model.CarByDecadeResponse;
import br.com.api.car.tinnova.model.CarRequest;
import br.com.api.car.tinnova.model.LatestRecordResponse;
import br.com.api.car.tinnova.model.CarByBrandResponse;
import br.com.api.car.tinnova.model.NotSoldedResponse;
import br.com.api.car.tinnova.repository.BrandRepositoryI;
import br.com.api.car.tinnova.repository.CarRepositoryI;

@Service
public class CarBoImpl<U> implements CarBo {

	@Autowired
	CarRepositoryI carRepository;

	@Autowired
	BrandRepositoryI brandRepositoryI;

	private static final String SUCESS = "Sucess";
	private static final String INVALID_BRAND = "BRAND IS INVALID";

	@Override
	public BaseResponse createCar(CarRequest car) {

		Car carBase = new Car();

		if ((brandRepositoryI.findById(car.getBrand().toUpperCase().trim())).isEmpty())
			return setBaseResponse(INVALID_BRAND, false);

		carBase = transformCarRequest(car);
		carRepository.save(carBase);

		return setBaseResponse(SUCESS, true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public BaseResponse updateCar(CarRequest car, Long id) {
		BaseResponse baseResponse = new BaseResponse();

		carRepository.findById(id).map((Function<? super Car, ? extends U>) record -> {
			record.setBrand(car.getBrand());
			record.setCar(car.getCar());
			record.setCreated(car.getCreated());
			record.setDescription(car.getDescription());
			record.setSold(car.isSold());
			record.setUpdated(car.getUpdated());
			record.setYear(car.getYear());
			carRepository.save(record);
			baseResponse.setStatus(SUCESS);
			baseResponse.setValidRequest(true);

			return (U) baseResponse;

		});

		return baseResponse;
	}

	@Override
	public BaseResponse deleteCar(Long id) {

		carRepository.deleteById(id);

		return setBaseResponse(SUCESS, true);
	}

	@Override
	public NotSoldedResponse amountSolded() {

		NotSoldedResponse notSoldedResponse = new NotSoldedResponse();

		notSoldedResponse.setAmountSolded(carRepository.findlAllNotSould());
		notSoldedResponse.setStatus(SUCESS);
		notSoldedResponse.setValidRequest(true);

		return notSoldedResponse;
	}

	@Override
	public CarByBrandResponse amountByBrand() {
		CarByBrandResponse carByBrandResponse = new CarByBrandResponse();
		carByBrandResponse.setListCarByBrand(carRepository.findlCarByBrand());
		carByBrandResponse.setStatus(SUCESS);
		carByBrandResponse.setValidRequest(true);

		return carByBrandResponse;
	}

	@Override
	public CarByDecadeResponse amountCarByDecade() {
		CarByDecadeResponse carByDecadeResponse = new CarByDecadeResponse();
		carByDecadeResponse.setListOfDecadeCar(carRepository.findlCarByDecade());
		carByDecadeResponse.setStatus(SUCESS);
		carByDecadeResponse.setValidRequest(true);

		return carByDecadeResponse;
	}

	@Override
	public LatestRecordResponse latestRecord() {
		LatestRecordResponse latestRecordResponse = new LatestRecordResponse();

		latestRecordResponse.setListCars(carRepository.findlAllRegisterWeak());
		latestRecordResponse.setStatus(SUCESS);
		latestRecordResponse.setValidRequest(true);

		return latestRecordResponse;

	}

	@Override
	public Optional<Car> getCar(Long id) {

		return carRepository.findById(id);
	}

	@Override
	public List<Car> getAllCar() {

		List<Car> cars = carRepository.findAll();
		return cars;
	}

	@Override
	public BaseResponse updateCarPatch(CarRequest car, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	private Car transformCarRequest(CarRequest car) {

		Car carBase = new Car();

		carBase.setBrand(car.getBrand());
		carBase.setCar(car.getCar());
		carBase.setCreated(car.getCreated());
		carBase.setDescription(car.getDescription());
		carBase.setSold(car.isSold());
		carBase.setUpdated(car.getUpdated());
		carBase.setYear(car.getYear());

		return carBase;

	}

	private BaseResponse setBaseResponse(String status, boolean validRequest) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(status);
		baseResponse.setValidRequest(validRequest);
		return baseResponse;

	}
}
