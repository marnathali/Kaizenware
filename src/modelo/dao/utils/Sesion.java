package modelo.dao.utils;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Sesion {

	private SessionFactory sessionFactory;
	
	private static Sesion instancia;
	public static Sesion getInstancia() {
		if (instancia == null) {
			instancia = new Sesion();
		}
		return instancia;
	}
	
	private Sesion() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		try {
			this.sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		} 
		catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public Session openSession() throws HibernateException {
		return sessionFactory.openSession();
	}
}
