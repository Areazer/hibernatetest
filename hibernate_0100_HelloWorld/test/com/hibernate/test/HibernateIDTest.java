package com.hibernate.test;

import java.sql.PseudoColumnUsage;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hibernate.model.Student;
import com.hibernate.model.StudentPK;
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
		StudentPK pk=new StudentPK();
		
		pk.setId(9);
		pk.setName("aaa");
		
		Student s = new Student();
		s.setPk(pk);
		s.setAge(9);	
		
		
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	@Test
	public void testTeacherSave() {
	
		Teacher t = new Teacher();
		
		t.setName("tt");
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
