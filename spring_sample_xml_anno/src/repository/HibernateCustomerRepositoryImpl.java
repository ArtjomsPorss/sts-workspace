package repository;

import java.util.ArrayList;
import java.util.List;
import model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Art");
		customer.setLastName("Porsh");
		
		customers.add(customer);
		
		return customers;
	}

}