/**
 * 
 */
package fr.diginamic.banque.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Stagiaire
 *
 */
@Entity
@Table(name="COMPTE")
public class Compte {
	
	/* Id de la table COMPTE */
	@Id
	private int id;
	/* Colonne NUMERO de la table COMPTE */
	@Column(name="NUMERO")
	private String numero;
	/* Colonne SOLDE de la table COMPTE */
	@Column(name="SOLDE")
	private double solde;
	
	@OneToMany(mappedBy="comptes")
	private Set <Operation> operations;
	
	@ManyToMany
	@JoinTable(name="RELATION", 
	joinColumns= @JoinColumn(name="ID_CPT", referencedColumnName="ID"), 
	inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID")
	)
	
	private Set <Client> clients = new HashSet<>(0);
	
	public Compte() {
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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the operations
	 */
	public Set<Operation> getOperations() {
		return operations;
	}

	/**
	 * @param operations the operations to set
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

	/**
	 * @return the clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	
}
