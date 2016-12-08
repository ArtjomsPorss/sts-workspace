package com.basics.service;

import java.util.List;

import com.basics.model.Customer;
import com.basics.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){}
	
	public CustomerServiceImpl(CustomerRepository repository){
		this.setCustomerRepository(repository);
	}
	
	/* (non-Javadoc)
	 * @see com.basics.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();	
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
