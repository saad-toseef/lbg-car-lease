package com.mustard.transport.CarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CarController {
	
	@Autowired
	private CarService carService;
	
	
	@RequestMapping(value="/Cars", method = RequestMethod.GET)
	public ResponseEntity<List<Car>> getAllCars(){
		
		List<Car> cars = carService.getAllCars();
		
		System.out.println(cars.get(0).getColour());
	
		
		return new ResponseEntity<>(cars,HttpStatus.OK);
	}
	
	@RequestMapping(value="/Cars/{id}", method = RequestMethod.GET)
	public ResponseEntity<Car> getById(@PathVariable Integer id){
		
		return new ResponseEntity<>(carService.getById(id),HttpStatus.OK);
	}
	
//	@RequestMapping(value ="/Cars", method = RequestMethod.GET)
//	public ResponseEntity<List<Car>> searchForCars(Car exampleCar){
//		
//		
//		List<Car> cars = carService.getExampleCars(exampleCar);
//		return new ResponseEntity<>(cars, HttpStatus.OK);
//		
//	}

}
