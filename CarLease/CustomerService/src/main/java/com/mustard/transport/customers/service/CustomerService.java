package com.mustard.transport.customers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustard.transport.customers.repoistry.CustomerRepository;
import com.mustard.transport.customers.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {

		List<Customer> customers = customerRepository.findAll();

		return customers;

	}
	
	public Optional<Customer> getCustomerById(int Id) {
		
		return customerRepository.findById(Id);
	}

}
