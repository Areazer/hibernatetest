import java.text.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Student;
import com.hibernate.model.Teacher;


public class TeacherTest {
	public static void main(String[] args){
		Teacher t = new Teacher();
		t.setId(14);
		t.setName("t1");  
		t.setTitle("�м�");
		
		
		Configuration cfg =new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
