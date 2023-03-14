package com.mustard.transport.CarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;
	
	
	@RequestMapping(value="/Cars", method = RequestMethod.GET)
	public ResponseEntity<List<Car>> getAllCars(){
		
		List<Car> cars = carService.getAllCars();
		
		
		
		
		return new ResponseEntity<>(cars,HttpStatus.OK);
	}

}
