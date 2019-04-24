package org.customerapi.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("/Customers")
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
	
	
	@RequestMapping("/Customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId)
	{
		return customerService.getCustomer(customerId);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/Customers")
	public void addCustomer(@RequestBody Customer customer)
	{
		
		customerService.addCustomer(customer);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Customers/{customerId}")
	public void removeCustomer(@PathVariable int customerId)
	{
		
		customerService.removeCustomer(customerId);
		
	}
	
	
}
