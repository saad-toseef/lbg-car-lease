package com.mustard.transport.customers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mustard.transport.customers.service.CustomerService;
import com.mustard.transport.customers.model.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customrService;
	
	
	@RequestMapping(value="/customers", method = RequestMethod.GET)
	public List<Customer> getAllCars(){
		
		List<Customer> customers = customrService.getAllCustomers();
		return customers;
	}

	@RequestMapping(value="id/{customerid}", method = RequestMethod.GET)
	public Optional<Customer> searchCustomerById(@PathVariable("customerId") int customerId) {
		return customrService.getCustomerById(customerId);
	}
	
	
}
