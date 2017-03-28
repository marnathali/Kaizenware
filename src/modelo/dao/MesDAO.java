package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Mes;

public class MesDAO extends GenericDAO {

	private static MesDAO instancia;	
	public static MesDAO getInstancia() {
		if (instancia == null) {
			instancia = new MesDAO();
		}
		return instancia;
	}
	
	private MesDAO() {
		super();
	}
	
	public List<Mes> queryAll() {	
		return super.queryAll(Mes.class);
	}

	public Mes get(Serializable id) {
		return (Mes)super.get(Mes.class, id);
	}

	public void save(Mes Mes) {		
		super.save(Mes);
	}

	public void update(Mes Mes) {
		super.update(Mes);
	}
	
	public void saveOrUpdate(Mes Mes) {
	    super.saveOrUpdate(Mes);
	}
	
	public void delete(Mes Mes) {
		super.delete(Mes);
	}
	
}

