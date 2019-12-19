/**
 * 
 */
package fr.diginamic.banque.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *
 */
@Entity

public class Virement extends Operation{
	
	/* ID de la table VIREMENT*/
	@Id
	private int id;
	
	/* Colonne BENEFICIAIRE de la table VIREMENT*/
	@Column(name="BENEFICIAIRE")
	private String beneficiaire;

	public Virement() {
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
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	

}
