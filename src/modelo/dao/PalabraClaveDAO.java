package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.PalabraClave;

public class PalabraClaveDAO extends GenericDAO {

	private static PalabraClaveDAO instancia;	
	public static PalabraClaveDAO getInstancia() {
		if (instancia == null) {
			instancia = new PalabraClaveDAO();
		}
		return instancia;
	}
	
	private PalabraClaveDAO() {
		super();
	}
	
	public List<PalabraClave> queryAll() {	
		return super.queryAll(PalabraClave.class);
	}

	public PalabraClave get(Serializable id) {
		return (PalabraClave)super.get(PalabraClave.class, id);
	}

	public void save(PalabraClave palabraClave) {		
		super.save(palabraClave);
	}

	public void update(PalabraClave palabraClave) {
		super.update(palabraClave);
	}
	
	public void saveOrUpdate(PalabraClave palabraClave) {
	    super.saveOrUpdate(palabraClave);
	}
	
	public void delete(PalabraClave palabraClave) {
		super.delete(palabraClave);
	}
	
}

