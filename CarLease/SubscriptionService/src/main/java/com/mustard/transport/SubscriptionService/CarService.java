package com.mustard.transport.CarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public List<Car> getAllCars() {

		List<Car> cars = carRepository.findAll();

		return cars;

	}

}
