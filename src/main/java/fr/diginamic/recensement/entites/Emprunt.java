/**
 * 
 */
package fr.diginamic.recensement.entites;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *Classe qui définit les relations et attributs de la table EMPRUNT
 */
@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	/* Colonne ID de la table EMPRUNT*/	
	@Id
	private int id;
	/* Colonne DATE_DEBUTde la table EMPRUNT*/	
	@Column(name = "DATE_DEBUT")
	
	private Date dateDebut;
	/* Colonne DATE_FIN la table EMPRUNT*/	
	@Column(name = "DATE_FIN")
	private Date dateFin;
	
	/* Colonne DELAI la table EMPRUNT*/	
	@Column(name = "DELAI")
	private int delai;
	
	
	@ManyToOne //jointure avec la table CLIENT
	@JoinColumn(name="ID_CLIENT")
	public Client client;// référence vers la table CLIENT
	
	@ManyToMany
	@JoinTable(name="COMPO", //jointure avec la table COMPO
			joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"), // définition ID_EMP de COMPO = ID from EMPRUNT
			inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID")// définition ID_LIV from COMPO=ID from LIVRE
			)
	private Set<Livre> livre; //
	
	
	
	public Emprunt() {
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
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}



	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}



	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}



	/**
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}



	/**
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}



	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}



	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}



	/**
	 * @return the livre
	 */
	public Set<Livre> getLivre() {
		return livre;
	}



	/**
	 * @param livre the livre to set
	 */
	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
	}
}
