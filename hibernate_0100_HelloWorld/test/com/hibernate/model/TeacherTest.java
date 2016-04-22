package com.hibernate.model;

import static org.junit.Assert.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeacherTest {
	private static SessionFactory sf= null;
	
	@BeforeClass
	public static void beforeclass(){
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
		
	}

	@Test
	public void testTeacherSave() {
		Teacher t = new Teacher();
		t.setId(16);
		t.setName("t1");  
		t.setTitle("ÖÐ¼¶");
		
		
		try {
			Session session;
			session = sf.openSession();
			session.beginTransaction();
			session.save(t);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	@AfterClass
	public static void afterClass(){
		sf.close();
	}

}
