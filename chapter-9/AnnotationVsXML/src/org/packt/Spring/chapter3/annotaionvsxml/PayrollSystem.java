package org.packt.Spring.chapter3.annotaionvsxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService = (EmployeeServiceImp)context.getBean("employeeServiceImp");
		
		System.out.println(employeeService);
	}

}
