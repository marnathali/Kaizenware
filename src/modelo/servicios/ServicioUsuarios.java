package modelo.servicios;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import modelo.dao.RolDAO;
import modelo.dao.UsuarioDAO;
import modelo.dto.Rol;
import modelo.dto.Usuario;

public class ServicioUsuarios {
	
	private UsuarioDAO usuarioDAO;
	private RolDAO rolDAO;
	
	private static ServicioUsuarios instancia;	
	public static ServicioUsuarios getInstancia() {
		if (instancia == null) {
			instancia = new ServicioUsuarios();
		}
		return instancia;
	}
	
	private ServicioUsuarios() {
		super();
		this.usuarioDAO = UsuarioDAO.getInstancia();
		this.rolDAO = RolDAO.getInstancia();
	}
	
	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = this.usuarioDAO.queryAll(); 
		return usuarios;
	}
	
	public List<Rol> getRoles() {
		List<Rol> roles = this.rolDAO.queryAll();
//		Collections.sort(roles);
		return roles;
	}
	
	public Usuario getUsuarioPorId(Serializable id) {
		if (id != null) {
			return this.usuarioDAO.get(id);
		}
		return null;
	}
	
	public Usuario validarUsuario(String nombre, String contrasena) 
	{
		
		    List<Usuario> usuarios = this.usuarioDAO.getPorNombre(nombre);
		    if(!usuarios.isEmpty())
		    {
		    	Usuario user = usuarios.get(0);
		    	if(user.getContrasena().equals(contrasena))
		    	{
		    		return user;
		    	}
		    	
		    }
		    
		    return null;
		
	}

	public Rol getRolPorId(Serializable id) {
		if (id != null) { 
			return this.rolDAO.get(id);
		}
		return null;
	}
	
	public Usuario incluirUsuario(Usuario usuario) {
		this.usuarioDAO.saveOrUpdate(usuario);
		return usuario;
	}

	public Usuario modificarUsuario(Integer id, Integer idRol, String contrasena, String contrasena_confirma,
			String foto_perfil, String nombre_usuario) {
		Usuario usuario = this.getUsuarioPorId(id);
		Rol rol = this.getRolPorId(idRol);
		usuario.setRol(rol);
		usuario.setContrasena(contrasena);
		usuario.setContrasena_confirma(contrasena_confirma);
		usuario.setFoto_perfil(foto_perfil);
		usuario.setNombre_usuario(nombre_usuario);
		this.usuarioDAO.saveOrUpdate(usuario);
		return this.getUsuarioPorId(id);
	}

	public String eliminarUsuario(Integer id) {
		Usuario usuario = this.getUsuarioPorId(id);
		if (usuario != null) {
			this.usuarioDAO.delete(usuario);
			return "ok";
		}
		return "No se pudo eliminar el usuario";
	}

}
