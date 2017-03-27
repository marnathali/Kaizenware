package modelo.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.dao.utils.GenericDAO;
import modelo.dao.utils.Sesion;
import modelo.dto.Usuario;

public class UsuarioDAO extends GenericDAO {

	private static UsuarioDAO instancia;	
	public static UsuarioDAO getInstancia() {
		if (instancia == null) {
			instancia = new UsuarioDAO();
		}
		return instancia;
	}

	private Sesion sesion;
	
	private UsuarioDAO() {
		super();
	}
	
	public List<Usuario> queryAll() {	
		return super.queryAll(Usuario.class);
	}

	public Usuario get(Serializable id) {
		return (Usuario)super.get(Usuario.class, id);
	}
	
	public List<Usuario> getPorNombre(String nombre) {
		this.sesion = Sesion.getInstancia();
		Session session = this.sesion.openSession();
        List<Usuario> usuario = null;        
        try{
            usuario = session.createCriteria(Usuario.class).add(Restrictions.eq("nombre_usuario", nombre)).list();
        } 
        catch (Exception e) {  
        	e.printStackTrace();        
        }  
        finally {  
            session.close();  
        }             
	    return usuario;
	}

	public void save(Usuario Usuario) {		
		super.save(Usuario);
	}

	public void update(Usuario Usuario) {
		super.update(Usuario);
	}
	
	public void saveOrUpdate(Usuario Usuario) {
	    super.saveOrUpdate(Usuario);
	}
	
	public void delete(Usuario Usuario) {
		super.delete(Usuario);
	}
	
}
