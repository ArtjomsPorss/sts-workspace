package com.basics.service;

import java.util.List;

import com.basics.model.Customer;
import com.basics.repository.CustomerRepository;
import com.basics.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.basics.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();	
	}
}
