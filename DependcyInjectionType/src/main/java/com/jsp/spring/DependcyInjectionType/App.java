package com.jsp.spring.DependcyInjectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Student student = new Student();
//		MathCheat che = new MathCheat();
//		student.setCheat(che);
//		student.chetting();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student student=context.getBean("student",Student.class);
		student.chetting();
		
		AnotherStudent s1=context.getBean("anotherStudent",AnotherStudent.class);
		s1.startCheating();
	}
}
