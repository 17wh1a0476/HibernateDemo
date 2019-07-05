package com.gp;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class TestClient2
{
	public static void main(String args[])
	{
		Configuration cfg=new AnnotationConfiguration();

		cfg=cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();

		Session session=factory.openSession();
		
		Student student = (Student)session.load(Student.class, 1);
		
		System.out.println("Id: " + student.getSno());
		System.out.println("Name: " + student.getSname());
		System.out.println("Address: " + student.getAddr());		
	} 
}