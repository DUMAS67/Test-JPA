/**
 * 
 */
package fr.diginamic.recensement.entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *Classe qui définit les relations et attributs de la table CLIENT
 */
@Entity
@Table(name = "CLIENT")
public class Client {

	/* Id de la Table CLIENT */
	@Id
	private int id;
	/* Colonne NOM de la table CLIENT */
	@Column(name = "NOM")
	private String nom;
	/* Colonne PRENOM de la table CLIENT */
	@Column(name = "PRENOM")
	private String prenom;

	/*
	 * Définition des relations entre table CLIENT et EMPRUNT La table CLIENT à
	 * un lien 1..n avec EMPRUNT
	 */
	@OneToMany(mappedBy = "client")
	private Set<Emprunt> emprunt; // référence avec la table EMPRUNT

	public Client() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the emprunt
	 */
	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}

	/**
	 * @param emprunt
	 *            the emprunt to set
	 */
	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}

}
