/**
 * 
 */
package fr.diginamic.banque.entites;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *
 */
@Entity
@Table(name= "CLIENT")
public class Client {
	/* ID de la table CLIENT*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	/* Colonne NOM de la table CLIENT */
	
	@Column(name="NOM")
	private String nom;
	/* Colonne PRENOM de la table CLIENT */
	
	@Column(name="PRENOM")
	private String prenom;
	/* Colonne DATENAISSANCE de la table CLIENT */
	
	@Column(name="DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresse;

	@ManyToOne 
	@JoinColumn(name="ID_BQ") 
	private Banque banques; 
	
	
	@ManyToMany
	@JoinTable(name="RELATION", 
	joinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"), 
	inverseJoinColumns= @JoinColumn(name="ID_CPT", referencedColumnName="ID")
	)
	private Set <Compte> comptes;
	
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the banques
	 */
	public Banque getBanques() {
		return banques;
	}

	/**
	 * @param banques the banques to set
	 */
	public void setBanques(Banque banques) {
		this.banques = banques;
	}

	/**
	 * @return the comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
