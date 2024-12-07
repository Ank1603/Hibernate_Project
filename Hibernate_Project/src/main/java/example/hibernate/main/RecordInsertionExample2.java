package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Movie;
import example.hibernate.utils.HibernateUtils;


public class RecordInsertionExample2 {
	
public static void main(String[] args) {
	//This programs makes use of standard practices
	try (
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		){
		Movie movieObj = new Movie("M04","Dangal","Inspirational",2015);

		Transaction tx = session.beginTransaction();
		
		
		session.persist(movieObj);
		tx.commit();
		System.out.println("Record Inserted");
		
	}catch(Exception ex){
		ex.printStackTrace();
	}
}
}
