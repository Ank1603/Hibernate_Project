package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordRetrievalExample {

	public static void main(String[] args) {
		
		try (

				SessionFactory factory = HibernateUtilities.getSessionFactory();

				Session session = factory.openSession();

		) {

			//Loading an entity of type : Actor against ID :A03
		Actor foundActor =	session.find(Actor.class, "A03");
		if(foundActor!=null) {
		System.out.println("Found Actor : "+ foundActor);
		System.out.println("First Name : "+ foundActor.getFirstName());
		System.out.println("Last Name : "+ foundActor.getLastName());
		}else {
			System.out.println("Actor with given ID does not exist ");
		}
		} catch (Exception ex)

		{

			ex.printStackTrace();

		
		}
	}
}
