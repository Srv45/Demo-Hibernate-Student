package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setReg_No(11907066);
		s.setName("Shubham Verma");
		s.setEmail("shubham@gmail.com");
		s.setAge(22);
		s.setAddress("Pune");
		ss.persist(s);
		tr.commit();
		ss.close();
		
		System.out.println(s);
	}
}
