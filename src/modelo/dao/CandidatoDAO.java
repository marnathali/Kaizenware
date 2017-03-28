package modelo.dao;

import java.io.Serializable;
import java.util.List;

import modelo.dao.utils.GenericDAO;
import modelo.dto.Candidato;

public class CandidatoDAO extends GenericDAO {

	private static CandidatoDAO instancia;	
	public static CandidatoDAO getInstancia() {
		if (instancia == null) {
			instancia = new CandidatoDAO();
		}
		return instancia;
	}
	
	private CandidatoDAO() {
		super();
	}
	
	public List<Candidato> queryAll() {	
		return super.queryAll(Candidato.class);
	}

	public Candidato get(Serializable id) {
		return (Candidato)super.get(Candidato.class, id);
	}

	public void save(Candidato candidato) {		
		super.save(candidato);
	}

	public void update(Candidato candidato) {
		super.update(candidato);
	}
	
	public void saveOrUpdate(Candidato candidato) {
	    super.saveOrUpdate(candidato);
	}
	
	public void delete(Candidato candidato) {
		super.delete(candidato);
	}
	
}

