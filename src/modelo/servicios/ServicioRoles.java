package modelo.servicios;

import java.io.Serializable;
import java.util.List;

import modelo.dao.RolDAO;
import modelo.dto.Rol;

public class ServicioRoles {
	
	private RolDAO rolDAO;
	
	private static ServicioRoles instancia;	
	public static ServicioRoles getInstancia() {
		if (instancia == null) {
			instancia = new ServicioRoles();
		}
		return instancia;
	}
	public ServicioRoles() {
		super();
		this.rolDAO = RolDAO.getInstancia();
	}
	
	public List<Rol> getRoles() {
		List<Rol> roles = this.rolDAO.queryAll();
		return roles;
	}
	
	public Rol getRolPorId(Serializable id) {
		if (id != null) { 
			return this.rolDAO.get(id);
		}
		return null;
	}	

}
