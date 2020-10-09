package br.com.api.car.tinnova.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.car.tinnova.business.CarBo;
import br.com.api.car.tinnova.model.BaseResponse;
import br.com.api.car.tinnova.model.Car;
import br.com.api.car.tinnova.model.CarByBrandResponse;
import br.com.api.car.tinnova.model.CarByDecadeResponse;
import br.com.api.car.tinnova.model.CarRequest;
import br.com.api.car.tinnova.model.LatestRecordResponse;
import br.com.api.car.tinnova.model.NotSoldedResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Question 5")
@RequestMapping(value = "/v1/car")
public class CarController implements Serializable {

	private static final long serialVersionUID = 8022952492849584333L;

	@Autowired
	CarBo carBo;

	@ApiOperation(value = "create a new car")
	@PostMapping
	public ResponseEntity<BaseResponse> persistNewCar(@RequestBody CarRequest car) throws Exception {

		BaseResponse baseResponse = new BaseResponse();

		baseResponse = carBo.createCar(car);

		return new ResponseEntity<>(baseResponse, HttpStatus.OK);

	}

	@ApiOperation(value = "update by put a car")
	@PutMapping(value = "/{id}")
	public ResponseEntity<BaseResponse> updatePutCar(@PathVariable Long id, @RequestBody CarRequest car)
			throws Exception {

		BaseResponse baseResponse = new BaseResponse();

		baseResponse = carBo.updateCar(car, id);

		return new ResponseEntity<>(baseResponse, HttpStatus.OK);

	}

	@ApiOperation(value = "update by patch a car")
	@PatchMapping(value = "/{id}")
	public ResponseEntity<BaseResponse> updatePatchCar(@PathVariable Long id, @RequestBody CarRequest car)
			throws Exception {

		BaseResponse baseResponse = new BaseResponse();

		baseResponse = carBo.updateCarPatch(car, id);

		return new ResponseEntity<>(baseResponse, HttpStatus.OK);

	}

	@ApiOperation(value = "get details a car")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Car>> getCar(@PathVariable Long id) throws Exception {

		Optional<Car> carResponse = carBo.getCar(id);

		return new ResponseEntity<>(carResponse, HttpStatus.OK);

	}

	@ApiOperation(value = "delete a car")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<BaseResponse> deleteCar(@PathVariable Long id) throws Exception {

		BaseResponse carResponse = carBo.deleteCar(id);

		return new ResponseEntity<>(carResponse, HttpStatus.OK);

	}

	@ApiOperation(value = "get details all cars")
	@GetMapping
	public ResponseEntity<List<Car>> getAllCar() throws Exception {

		List<Car> cars = new ArrayList<Car>();

		cars = carBo.getAllCar();

		return new ResponseEntity<>(cars, HttpStatus.OK);

	}

	@ApiOperation(value = "get not solded cars")
	@GetMapping(value = "/notSoldedCar")
	public ResponseEntity<NotSoldedResponse> getNotSolded() throws Exception {

		NotSoldedResponse notSolded = new NotSoldedResponse();

		notSolded = carBo.amountSolded();

		return new ResponseEntity<>(notSolded, HttpStatus.OK);

	}

	@ApiOperation(value = "get amount car by brand")
	@GetMapping(value = "/CarbyBrand")
	public ResponseEntity<CarByBrandResponse> getCarByBrand() throws Exception {

		CarByBrandResponse carByBrand = new CarByBrandResponse();

		carByBrand = carBo.amountByBrand();

		return new ResponseEntity<>(carByBrand, HttpStatus.OK);

	}

	@ApiOperation(value = "get amount car by decade")
	@GetMapping(value = "/CarbyDecade")
	public ResponseEntity<CarByDecadeResponse> getCarByDecade() throws Exception {

		CarByDecadeResponse carByDecade = new CarByDecadeResponse();
		
		carByDecade = carBo.amountCarByDecade();

		return new ResponseEntity<>(carByDecade, HttpStatus.OK);

	}

	@ApiOperation(value = "get amount car registered in last weak")
	@GetMapping(value = "/CarRegisteredLastWeak")
	public ResponseEntity<LatestRecordResponse> getCarRegisteredLastWeak() throws Exception {

		LatestRecordResponse latestRecord = new LatestRecordResponse();
		latestRecord = carBo.latestRecord();

		return new ResponseEntity<>(latestRecord, HttpStatus.OK);

	}

}
