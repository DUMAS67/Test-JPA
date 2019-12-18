package fr.diginamic.recensement.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")

/*
 * Classe décrivant un Livre rattaché à la table LIVRE*./
 * 
 */
public class Livre {

	/* Id de la table LIVRE */
	@Id
	private int id;

	/* Champ TITRE de la table LIVRE */
	@Column(name = "TITRE")
	private String titre;

	/* Cham Auteur de la table LIVRE */
	@Column(name = "AUTEUR")

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
