package br.com.api.car.tinnova.business;

import java.util.List;
import java.util.Optional;

import br.com.api.car.tinnova.model.BaseResponse;
import br.com.api.car.tinnova.model.Car;
import br.com.api.car.tinnova.model.CarByDecadeResponse;
import br.com.api.car.tinnova.model.CarRequest;
import br.com.api.car.tinnova.model.LatestRecordResponse;
import br.com.api.car.tinnova.model.CarByBrandResponse;
import br.com.api.car.tinnova.model.NotSoldedResponse;

public interface CarBo {

	public BaseResponse createCar(CarRequest car);

	public BaseResponse updateCar(CarRequest car, Long id);

	public BaseResponse updateCarPatch(CarRequest car, Long id);

	public BaseResponse deleteCar(Long id);

	public NotSoldedResponse amountSolded();

	public CarByBrandResponse amountByBrand();

	public CarByDecadeResponse amountCarByDecade();

	public LatestRecordResponse latestRecord();

	public Optional<Car> getCar(Long id);

	public List<Car> getAllCar();

}
