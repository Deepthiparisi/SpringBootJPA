package com.klu.JFSDS25_hibernta;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		
		Transaction t = s.beginTransaction();
      
		Employee emp = new Employee();
		emp.setEid(222);
		emp.setEname("mny");
		emp.setEsal(35000);
	
	   s.save(emp);	
		
		
		t.commit();
		sf.close();
		s.close();
		
		
		

	}

}
