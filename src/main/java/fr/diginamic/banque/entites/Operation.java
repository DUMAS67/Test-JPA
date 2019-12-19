/**
 * 
 */
package fr.diginamic.banque.entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *
 */
@Entity
@Table(name="OPERATION")
public class Operation {
	
	/* ID de la Table OPERATION */
	@Id
	private int id;
	/* Colonne DATE de la Table OPERATION */
	@Column(name="DATE")
	private LocalDateTime date;
	/* Colonne MONTANT de la Table OPERATION */
	@Column(name="MONTANT")
	private double montant;
	/* Colonne MOTIF de la Table OPERATION */
	@Column(name="MOTIF")
	private String motif;

	@ManyToOne 
	@JoinColumn(name="ID_CPT") 
	private Compte comptes; 
	
	
	public Operation() {
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
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}


	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}


	/**
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}


	/**
	 * @return the comptes
	 */
	public Compte getComptes() {
		return comptes;
	}


	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(Compte comptes) {
		this.comptes = comptes;
	}
	
	

}