/* Classe executable de Test de création de Table */
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import fr.diginamic.banque.entites.Adresse;
import fr.diginamic.banque.entites.Banque;
import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Operation;

public class TestJpa {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("client-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();
		
		/* Données pour la Table BANQUE */
		Banque bq = new Banque();
		bq.setId(1);
		bq.setNom("CIC");
		em.persist(bq);

		Banque bq1 = new Banque();
		bq1.setId(2);
		bq1.setNom("Societe Generale");
		em.persist(bq1);

		/* Données pour la Table CLIENT */
		Client c = new Client();
		c.setId(1);
		c.setNom("Durand");
		c.setPrenom("Paul");
		c.setDateNaissance(LocalDate.of(1977, 3, 24));
		c.setBanques(bq);
	

		/* Données pour adresse */
		Adresse a = new Adresse();
		a.setId(1);
		a.setNumero(45);
		a.setRue("Clemenceau");
		a.setVille("Mandelieu");
		a.setCodePostal(14000);
		c.setAdresse(a);
		
		em.persist(c);
		
		Client c1 = new Client();
		c1.setId(2);
		c1.setNom("Dutertre");
		c1.setPrenom("Jean");
		c1.setBanques(bq1);
		c1.setDateNaissance(LocalDate.of(1979, 9, 24));

		/* Données pour adresse */
		Adresse a1 = new Adresse();
		a1.setId(2);
		a1.setNumero(34);
		a1.setRue("Pierre Ducros");
		a1.setVille("Bordeaux");
		a1.setCodePostal(33000);
		c1.setAdresse(a1);
		em.persist(c1);

		/* Table COMPTE */

		Compte co = new Compte();
		co.setId(1);
		co.setNumero("123456789");
		co.setSolde(14500.0d);
		co.getClients().add(c);
		em.persist(co);
		
		Compte co1 = new Compte();
		co1.setId(2);
		co1.setNumero("9874561230");
		co1.setSolde(28_000.0d);
		co1.getClients().add(c1);
		em.persist(co1);

		/* Données pour la Table Operation*/
		Operation op = new Operation();
		op.setId(1);
		op.setComptes(co);
		op.setMontant(3000);
		op.setMotif("Credit");
		op.setDate(LocalDateTime.of(2017, 2, 24, 20, 53, 1));
		em.persist(op);
		
		Operation op1 = new Operation();
		op1.setId(2);
		op1.setComptes(co);
		op1.setMontant(2000);
		op1.setMotif("Débit");
		op1.setDate(LocalDateTime.of(2017, 2, 26, 20, 53, 1));
		em.persist(op1);
		
		et.commit();
		em.close();

	}

}
