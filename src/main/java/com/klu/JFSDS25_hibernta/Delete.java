package com.klu.JFSDS25_hibernta;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		 
        SessionFactory sf = cfg.buildSessionFactory();
        
      
        Session s = sf.openSession();
        
      
        Transaction t = s.beginTransaction();
        
    
        Employee emp = s.get(Employee.class, 111);
        
       
		
		s.delete(emp);
		t.commit(); 
		
		System.out.print("Deleted");
		s.close();
		sf.close();

	}

}