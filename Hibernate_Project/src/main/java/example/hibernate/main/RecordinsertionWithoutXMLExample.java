package example.hibernate.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import example.hibernate.entity.Actor;

import example.hibernate.utils.HibernateUtilities;

public class RecordinsertionWithoutXMLExample {

	public static void main(String[] args) {

		try (

				SessionFactory factory = HibernateUtilities.getSessionFactory();

				Session session = factory.openSession();

		) {

			Actor actorObj = new Actor("AO2", "Sammantha", "official", 35);

			Transaction tx = session.beginTransaction();

			session.persist(actorObj);

			tx.commit();

			System.out.println("Record Added✅🎊");

		} catch (Exception ex)

		{

			ex.printStackTrace();

		}

	}

}