/**
 * 
 */
package fr.diginamic.banque.entites;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Stagiaire
 *
 */

@Entity

public class LivretA extends Compte{
	
	/* ID de la table LIVRETA
	@Id
	private int id;*/
	
	@Column(name="TAUX")
	/* Colonne TAUX de la table LIVRETA*/
	private Double taux;

	
	
	public LivretA() {
		super();
	}






	/**
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}



	/**
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	
	

}
