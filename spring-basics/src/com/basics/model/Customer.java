package com.basics.model;

public class Customer {
	private String firstName;
	private String lastName;
	
	public Customer(){}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString(){
		return this.getFirstName() + " " + this.getLastName();
	}
}
