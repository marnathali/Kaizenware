package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Asistencia;

public class AsistenciaDAO extends GenericDAO {

	private static AsistenciaDAO instancia;	
	public static AsistenciaDAO getInstancia() {
		if (instancia == null) {
			instancia = new AsistenciaDAO();
		}
		return instancia;
	}
	
	private AsistenciaDAO() {
		super();
	}
	
	public List<Asistencia> queryAll() {	
		return super.queryAll(Asistencia.class);
	}

	public Asistencia get(Serializable id) {
		return (Asistencia)super.get(Asistencia.class, id);
	}

	public void save(Asistencia asistencia) {		
		super.save(asistencia);
	}

	public void update(Asistencia asistencia) {
		super.update(asistencia);
	}
	
	public void saveOrUpdate(Asistencia asistencia) {
	    super.saveOrUpdate(asistencia);
	}
	
	public void delete(Asistencia asistencia) {
		super.delete(asistencia);
	}
	
}

