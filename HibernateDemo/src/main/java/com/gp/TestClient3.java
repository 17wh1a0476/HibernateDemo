package com.gp;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class TestClient3
{
	public static void main(String args[])
	{
		Configuration cfg=new AnnotationConfiguration();

		cfg=cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();

		Session session=factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Person person = new Person();
		person.setPersonId(1);
		person.setPersonName("SACHIN");
		person.setMobile("98989898");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleId(1);
		vehicle1.setVehicleName("BMW Car");
		vehicle1.setModel("XYZ ABC");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleId(2);
		vehicle2.setVehicleName("I20 GRAND");
		vehicle2.setModel("MAGNA");
		
		person.getVehicles().add(vehicle1);
		person.getVehicles().add(vehicle2);
		
		vehicle1.setPerson(person);
		vehicle2.setPerson(person); 
		
		session.persist(person);
		//session.save(vehicle1);
		//session.save(vehicle2);
		
		tx.commit();
		session.close();
		System.out.println("Objects saved successfully...");
		
		
		Person p = (Person) session.load(Person.class, 1);
		Transaction tx2 = session.beginTransaction();
		session.delete(p);
		System.out.println("Person deleted.......");
		tx2.commit();
		
		 		
	} 
}