package com.dsy;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class FactoryProviderUtility {
	static SessionFactory sf=null;
	static {
	try {
		Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static SessionFactory getFactory() {
		return sf;
	}
}