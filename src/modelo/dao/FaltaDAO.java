package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Falta;

public class FaltaDAO extends GenericDAO {

	private static FaltaDAO instancia;	
	public static FaltaDAO getInstancia() {
		if (instancia == null) {
			instancia = new FaltaDAO();
		}
		return instancia;
	}
	
	private FaltaDAO() {
		super();
	}
	
	public List<Falta> queryAll() {	
		return super.queryAll(Falta.class);
	}

	public Falta get(Serializable id) {
		return (Falta)super.get(Falta.class, id);
	}

	public void save(Falta falta) {		
		super.save(falta);
	}

	public void update(Falta falta) {
		super.update(falta);
	}
	
	public void saveOrUpdate(Falta falta) {
	    super.saveOrUpdate(falta);
	}
	
	public void delete(Falta falta) {
		super.delete(falta);
	}
	
}

