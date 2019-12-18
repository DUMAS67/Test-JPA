import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.recensement.entites.Client;
import fr.diginamic.recensement.entites.Emprunt;
import fr.diginamic.recensement.entites.Livre;

public class TestConnexionJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("client-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();

		/*
		 * requête qui permet d’extraire un emprunt et tous ses livres associés
		 */
		Emprunt emp = em.find(Emprunt.class, 2);
		Set<Livre> setLivre = emp.getLivre();
		System.out.println("**************************************************************************");
		System.out.println("Requête qui permet d’extraire un emprunt et tous ses livres associés");
		System.out.println("**************************************************************************");
		System.out.println(
				"ID : " + emp.getId() + " Client : " + emp.getClient().getNom() + " " + emp.getClient().getPrenom()
						+ " Date de début : " + emp.getDateDebut() + " Date de fin : " + emp.getDateFin());
		System.out.println("Livre.s emprunté.s");
		for (Livre l : setLivre) {
			System.out.println("Titre : " + l.getTitre() + " Auteur : " + l.getAuteur());
		}

		/* requête qui permet d’extraire tous les emprunts d’un client donné. */

		System.out.println("**************************************************************************");
		System.out.println("Requête qui permet d’extraire tous les emprunts d’un client donné");
		System.out.println("**************************************************************************");
		Client client = em.find(Client.class, 1);

		Set<Emprunt> emprunt = client.getEmprunt();
		System.out.println("\nID : " + client.getId() + " Client : " + client.getNom() + " " + client.getPrenom());
		for (Emprunt emp1 : emprunt) {
			System.out.println("\nDate de début : " + emp.getDateDebut() + " Date de fin : " + emp.getDateFin());
			for (Livre liv : emp1.getLivre()) {
				System.out.println("Livre :" + liv.getTitre() + " Auteur : " + liv.getAuteur());
			}
		}

		em.close();

	}

}
