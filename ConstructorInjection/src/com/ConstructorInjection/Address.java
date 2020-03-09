package com.ConstructorInjection;

public class Address 
{
	private String city;
	private String state;
	private String country;
	
	public Address()
	{
		System.out.println("Default Constructor");
	}
	
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void showAddress()
	{
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		System.out.println("Country :"+country);
	}
}
