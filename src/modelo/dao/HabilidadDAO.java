package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Habilidad;

public class HabilidadDAO extends GenericDAO {

	private static HabilidadDAO instancia;	
	public static HabilidadDAO getInstancia() {
		if (instancia == null) {
			instancia = new HabilidadDAO();
		}
		return instancia;
	}
	
	private HabilidadDAO() {
		super();
	}
	
	public List<Habilidad> queryAll() {	
		return super.queryAll(Habilidad.class);
	}

	public Habilidad get(Serializable id) {
		return (Habilidad)super.get(Habilidad.class, id);
	}

	public void save(Habilidad habilidad) {		
		super.save(habilidad);
	}

	public void update(Habilidad habilidad) {
		super.update(habilidad);
	}
	
	public void saveOrUpdate(Habilidad habilidad) {
	    super.saveOrUpdate(habilidad);
	}
	
	public void delete(Habilidad habilidad) {
		super.delete(habilidad);
	}
	
}

