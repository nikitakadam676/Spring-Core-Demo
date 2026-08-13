package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
public static void main(String []args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Text.XML");
	Employee emp=(Employee)context.getBean("e");
	emp.show();
}
}
