package com.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) {
		Resource resourse = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(resourse);
		
		Employee employee = (Employee)factory.getBean("employeebean");
		ConstructorInjectionWithCollection collection = (ConstructorInjectionWithCollection)factory.getBean("collectionbean");
		employee.showEmployeeDetail();
		collection.showDetail();
	}

}
