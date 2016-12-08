package com.basics.repository;

import java.util.ArrayList;
import java.util.List;

import com.basics.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.basics.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Smith");
		customers.add(customer);
		
		return customers;
	}
}
