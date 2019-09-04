package jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpautil {
	
	private static EntityManagerFactory factory = null;
	
	static {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("primeiroprojetojsf");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
		

}
