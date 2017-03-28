package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Pais;

public class PaisDAO extends GenericDAO {

	private static PaisDAO instancia;	
	public static PaisDAO getInstancia() {
		if (instancia == null) {
			instancia = new PaisDAO();
		}
		return instancia;
	}
	
	private PaisDAO() {
		super();
	}
	
	public List<Pais> queryAll() {	
		return super.queryAll(Pais.class);
	}

	public Pais get(Serializable id) {
		return (Pais)super.get(Pais.class, id);
	}

	public void save(Pais pais) {		
		super.save(pais);
	}

	public void update(Pais pais) {
		super.update(pais);
	}
	
	public void saveOrUpdate(Pais pais) {
	    super.saveOrUpdate(pais);
	}
	
	public void delete(Pais pais) {
		super.delete(pais);
	}
	
}

