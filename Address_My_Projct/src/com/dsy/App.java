package com.dsy;
import org.hibernate.SessionFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SessionFactory sf=FactoryProviderUtility.getFactory();		
		Student stu=new Student();
		
		stu.setCity("noida");
		stu.setSname("jyoti");
		stu.setSid(1234);
		stu.setStatus("enable");
		stu.setTotalfee(45000.00);
		System.out.println("Student object reference: "+stu);
		
		Address ad=new Address();
		ad.setStreet("BMC");
		ad.setCity("noida");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(2345.98);
		
		// reading image
		
		FileInputStream fis= new FileInputStream("src/adiyogi.jpg");
		System.out.println("FileInputStream object reference: "+fis);
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		fis.close();
		
		System.out.println("Address object reference: "+ad);
		
		Session s=sf.openSession();
		System.out.println("Session object ref : "+s);
		Transaction tx=s.beginTransaction();
		System.out.println("Transaction object ref : "+tx);
		s.save(stu);
		s.save(ad);
		System.out.println("Saving the objects into database");
		tx.commit();
		System.out.println("commiting the queries the objects into database");
		s.close();
		System.out.println("Session closing....");
		System.out.println("done.....");
	}

}
