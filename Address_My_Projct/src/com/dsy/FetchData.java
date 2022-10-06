
/*
package com.dsy;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {
	try {
	SessionFactory sf=FactoryProviderUtility.getFactory();
	// get(), load() method
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	Student stu=(Student)s.load(Student.class,2);
	{
	System.out.println(stu.getSid()+"\t"+stu.getSname());
	}
	{
	System.out.println(stu);
	}
	tx.commit();
	s.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
*/