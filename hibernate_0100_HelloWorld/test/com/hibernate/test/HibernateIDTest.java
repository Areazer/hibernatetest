package com.hibernate.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hibernate.model.Student;
import com.hibernate.model.Teacher;

public class HibernateIDTest {
private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void beforeClass() {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	


	@Test
	public void testStudentSave() {
		Student s = new Student();
		
		s.setName("zhangsan");	
		s.setAge(8);
		
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	@Test
	public void testTeacherSave() {
	
		Teacher t = new Teacher();
		t.setId(1);
		t.setName("t1");
		t.setTitle("middle");
		
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
	
	public static void main(String[] args) {
		beforeClass();
	}
	


}
