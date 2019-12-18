import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.recensement.entites.Region;

public class TestConnexionJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fournisseur-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();

		Region r= em.find(Region.class, 76);
		System.out.println(r.getNom());
		em.close();
	}

}
