package com.mustard.transport.CarService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public List<Car> getAllCars() {

		List<Car> cars = new ArrayList<Car>();

		for (int i = 1; i <= 10; i++) {

			Car car = new Car();

			car.setId(i);
			car.setColour("MUSTARD");
			car.setFuelType("ELECTRIC");
			car.setManufacturer("FORD");
			car.setModel("FOCUS " + i);
			cars.add(car);
		}

		 List<Car> carses = carRepository.findAll();
//		 
//		 for(Car car : carses)
//			 System.out.println(car.getColour());

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
