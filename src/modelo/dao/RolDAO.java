package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Rol;

public class RolDAO extends GenericDAO {

	private static RolDAO instancia;	
	public static RolDAO getInstancia() {
		if (instancia == null) {
			instancia = new RolDAO();
		}
		return instancia;
	}
	
	private RolDAO() {
		super();
	}
	
	public List<Rol> queryAll() {	
		return super.queryAll(Rol.class);
	}

	public Rol get(Serializable id) {
		return (Rol)super.get(Rol.class, id);
	}

	public void save(Rol Rol) {		
		super.save(Rol);
	}

	public void update(Rol Rol) {
		super.update(Rol);
	}
	
	public void saveOrUpdate(Rol Rol) {
	    super.saveOrUpdate(Rol);
	}
	
	public void delete(Rol Rol) {
		super.delete(Rol);
	}
	
}

