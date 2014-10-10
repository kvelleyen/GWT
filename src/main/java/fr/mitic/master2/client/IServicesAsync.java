package fr.mitic.master2.client;

import java.sql.Date;
import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fr.mitic.master2.shared.Evenement;
import fr.mitic.master2.shared.Personne;
import fr.mitic.master2.shared.Voiture;

public interface IServicesAsync {

	
	public void creatEvent (String lieu, Date date, Collection<Voiture> voitures,AsyncCallback<Void> res);
	public void creatVoiture (int nbPlace, Collection<Evenement> events, Personne chauffeur, Collection<Personne> passagers,AsyncCallback<Void> res);
	public void creatPersonne (String name,AsyncCallback<Void> res);
	
	public void removePersonne (int idPersonne,AsyncCallback<Void> res);
	public void removeVoiture (int idVoiture,AsyncCallback<Void> res);
	public void removeEvent (int idEvent,AsyncCallback<Void> res);

	public void  getAllEvent(AsyncCallback<Collection<Evenement> > res);
	public void getAllPersonne(AsyncCallback<Collection<Personne> > res);
	public void getAllVoiture(AsyncCallback<Collection<Voiture> > res);
	
	public void getDriver (int idVoit,AsyncCallback<Personne> res);
	public void getPassengers (int idVoit,AsyncCallback<Collection<Personne> > res);
	public void getCarsDrive (int idPersonnne,AsyncCallback<Collection<Voiture> > res);
	public void getCarsPassing (int idPersonne,AsyncCallback<Collection<Voiture> > res);
	
	public void getCarsByEvent (int idEvent,AsyncCallback<Collection<Voiture> > res);
	public void getEventsByCar (int idVoiture,AsyncCallback<Collection<Evenement> > res);
	
}
