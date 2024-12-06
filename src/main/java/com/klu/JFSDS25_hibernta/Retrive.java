package com.klu.JFSDS25_hibernta;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Retrive {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		 
        SessionFactory sf = cfg.buildSessionFactory();
        
      
        Session s = sf.openSession();
        
      
        Transaction t = s.beginTransaction();
        
    
        Employee emp = s.get(Employee.class, 111);
        System.out.println(emp.getEname());

		t.commit();

	}

}