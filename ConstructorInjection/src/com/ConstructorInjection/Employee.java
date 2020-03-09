package com.ConstructorInjection;

public class Employee 
{
	private int id;
	private String name;
	private Address address;
	
	public Employee(int id, String name, Address address)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void showEmployeeDetail()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		address.showAddress();
	}
}
