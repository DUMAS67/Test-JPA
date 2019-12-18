package fr.diginamic.recensement.entites;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")

/*
 * Classe qui définit les relations et attributs de la table LIVRE
 * 
 */
public class Livre {

	/* Id de la table LIVRE */
	@Id
	private int id;

	/* Colonne TITRE de la table LIVRE */
	@Column(name = "TITRE")
	private String titre;

	/* Colonne Auteur de la table LIVRE */
	@Column(name = "AUTEUR")

	/* Définition des relations entre table COMPO et LIVRE par les clefs étrangères
	 * La table LIVRE à un lien n..n
	 * */
	@ManyToMany
	@JoinTable(name="COMPO", //jointure avec la table COMPO
	joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"), // définition ID_LIV from COMPO=ID from LIVRE
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID") // définition ID_EMP de COMPO = ID from EMPRUNT
	)
private Set<Emprunt> emprunt;
	
	
	private String auteur;

	public Livre() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
