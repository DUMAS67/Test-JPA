/**
 * 
 */
package fr.diginamic.banque.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Stagiaire
 *
 */
@Entity

public class AssuranceVie extends Compte{

	
	
	/* Colonne DATE_FIN de la table ASSURANCEVIE*/
	@Column(name="DATE_FIN")
	private LocalDate dateFin;
	
	/* colonne TAUX de la table ASSURANCEVIE*/
	@Column(name="TAUX")
	private Double taux;

	public AssuranceVie() {
		super();
	}



	/**
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
