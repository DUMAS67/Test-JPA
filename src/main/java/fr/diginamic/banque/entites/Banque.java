/**
 * 
 */
package fr.diginamic.banque.entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *
 */
@Entity
@Table(name = "BANQUE")
public class Banque {
	
	/* id de la table BANQUE */
	@Id
	private int id;
	
	/* Colonne NOM de la table BANQUE */
	
	@Column(name="NOM")
	private String nom;
	
	@OneToMany(mappedBy= "banques")
	private Set <Client> clients;
	
	
	public Banque() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}





	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}





	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}





	/**
	 * @return the clients
	 */
	public Set<Client> getClients() {
		return clients;
	}





	/**
	 * @param clients the clients to set
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
}
