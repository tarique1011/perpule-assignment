package org.customerapi.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int customerId;
	private String name;
	private String number;
	private String age;
	private String gender;
	private String location;
	
	public Customer()
	{
		
	}
	
	public Customer(int customerId, String name, String number, String age, String gender, String location) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.number = number;
		this.age = age;
		this.gender = gender;
		this.location = location;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
