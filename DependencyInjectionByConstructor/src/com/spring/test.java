package com.spring;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;


public class test 
{

	public static void main(String[] args)
	{
		
			Resource resource=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("studentBean");  
		    DependencyInjectionByConstructor injector=(DependencyInjectionByConstructor)factory.getBean("DependencyInjectionByConstructorBean");
		    
		    student.displayInfo();  
		    injector.showData();
	}
}
