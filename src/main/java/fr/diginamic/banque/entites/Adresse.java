/**
 * 
 */
package fr.diginamic.banque.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Stagiaire
 *Classe qui définit les relations et attributs de la table Adresse
 */
@Embeddable 

public class Adresse {
	

	
	/* Colonne NUMERO de la table ADRESSE */
	@Column(name="NUMERO")
	private int numero;
	/* Colonne RUE de la table ADRESSE */
	@Column(name="RUE")
	private String rue;
	/* Colonne CODE_POSTAL de la table ADRESSE */
	@Column(name="CODE_POSTAL")
	private int codePostal;
	/* Colonne VILLE de la table ADRESSE */
	@Column(name="VILLE")
	private String ville;

	
	public Adresse() {
		super();
	}



	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}


	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}


	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}


	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	

}
