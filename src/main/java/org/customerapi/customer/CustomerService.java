package org.customerapi.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> customer = new ArrayList<>();
		customerRepository.findAll().forEach(customer::add);
		
		return customer;
	}
	
	public Customer getCustomer(int customerId) 
	{
		
		Customer customer = (Customer)customerRepository.findById(customerId).get();
		return customer;
	}

	
	public void addCustomer(Customer customer)
	{
		customerRepository.save(customer);
	}

	
	public void removeCustomer(int customerId) 
	{
		
		customerRepository.deleteById(customerId);
		
	}
	
}
