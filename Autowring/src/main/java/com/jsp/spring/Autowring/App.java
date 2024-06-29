package com.jsp.spring.Autowring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Student bean = context.getBean("student",Student.class);
    	bean.display();
    	
    	Student s2=context.getBean("sName",Student.class);
    	s2.display();
    }
}

