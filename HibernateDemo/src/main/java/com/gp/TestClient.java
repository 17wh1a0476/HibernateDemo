package com.gp;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class TestClient
{
	public static void main(String args[])
	{
		Configuration cfg=new AnnotationConfiguration();

		cfg=cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		Student st=new Student();
		st.setSno(new Integer(101));
		st.setSname("Rishabh Pant");
		st.setAddr("Roorke");
		session.save(st);
		tx.commit();
	} 
}