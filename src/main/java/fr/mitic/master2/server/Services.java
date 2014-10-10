package fr.mitic.master2.server;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.mitic.master2.client.IServices;
import fr.mitic.master2.shared.Evenement;
import fr.mitic.master2.shared.Personne;
import fr.mitic.master2.shared.Voiture;

public class Services implements IServices{
	
	EntityManager manager;

	public void creatEvent(String lieu, Date date, Collection<Voiture> voitures) {
		// TODO Auto-generated method stub
		
	}

	public void creatVoiture(int nbPlace, Collection<Evenement> events,
			Personne chauffeur, Collection<Personne> passagers) {
		// TODO Auto-generated method stub
		
	}

	public void creatPersonne(String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		EntityTransaction t = manager.getTransaction();
		t.begin();
		
		Personne p = new Personne(name);
		
		manager.persist(p);
		
		t.commit();
		
		
	}

	public void removePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		
	}

	public void removeVoiture(int idVoiture) {
		// TODO Auto-generated method stub
		
	}

	public void removeEvent(int idEvent) {
		// TODO Auto-generated method stub
		
	}

	public Collection<Evenement> getAllEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Personne> getAllPersonne() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Voiture> getAllVoiture() {
		// TODO Auto-generated method stub
		return null;
	}

	public Personne getDriver(int idVoit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Personne> getPassengers(int idVoit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Voiture> getCarsDrive(int idPersonnne) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Voiture> getCarsPassing(int idPersonne) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Voiture> getCarsByEvent(int idEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Evenement> getEventsByCar(int idVoiture) {
		// TODO Auto-generated method stub
		return null;
	}

}
