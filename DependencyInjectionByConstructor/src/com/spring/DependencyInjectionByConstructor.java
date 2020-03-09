package com.spring;


	public class DependencyInjectionByConstructor
	{
		private int id;  
		private String name;  
		  
		public DependencyInjectionByConstructor() 
		{
			System.out.println("Default Contructor");
		}  
		  
		public DependencyInjectionByConstructor(int id) 
		{
			this.id = id;
		}  
		  
		public DependencyInjectionByConstructor(String name) 
		{  
			this.name = name;
		}  
		  
		public DependencyInjectionByConstructor(int id, String name) 
		{  
		    this.id = id;  
		    this.name = name;  
		}  
		  
		void showData()
		{  
		    System.out.println("id:"+id);  
		    System.out.println("name:"+name);
		}  
		  
		
	}
