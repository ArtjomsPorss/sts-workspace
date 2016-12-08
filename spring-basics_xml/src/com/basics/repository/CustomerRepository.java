package com.basics.repository;

import java.util.List;

import com.basics.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}