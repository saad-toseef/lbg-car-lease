package com.mustard.transport.CarService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	//@Autowired
	//private CarRepository carRepository;

	public List<Car> getAllCars() {
		
		Car car = new Car();
		
		
		car.setColour("BLUE");
		car.setContractEnd("CONTRACT");
		
		Car newCar = new Car();
		newCar.setColour("RED");
		car.setContractEnd("CONTRACT2");
		List<Car> cars = new ArrayList<Car>();
		cars.add(car);
		cars.add(newCar);

		//List<Car> cars = carRepository.findAll();

		return cars;

	}
//	
//	public List<Car> getExampleCars(Car exampleCar){
//		
//		Example<Car> example = Example.of(exampleCar);
//		
//		List<Car> cars = carRepository.findAll(example);
//		
//		return cars;
//		
//		
//	}

}
