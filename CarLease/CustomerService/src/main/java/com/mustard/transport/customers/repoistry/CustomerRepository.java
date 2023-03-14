package com.mustard.transport.customers.repoistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustard.transport.customers.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
