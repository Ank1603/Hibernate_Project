
package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordDeletionExample {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateUtilities.getSessionFactory();
				Session session = factory.openSession();
		) {

			// Loading an entity of type : Actor against ID :A03
			Actor foundActor = session.find(Actor.class, "A03");
			Transaction tx = session.beginTransaction();
			session.remove(foundActor);
			tx.commit();

			System.out.println("Record Deleted✅🎊");
		} catch (Exception ex)

		{
			ex.printStackTrace();
		}
	}
	
}
