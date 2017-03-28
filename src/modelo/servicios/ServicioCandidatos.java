package modelo.servicios;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import modelo.dao.PaisDAO;
import modelo.dao.PalabraClaveDAO;
import modelo.dao.CandidatoDAO;
import modelo.dto.Pais;
import modelo.dto.PalabraClave;
import modelo.dto.Candidato;

public class ServicioCandidatos {
	
	private CandidatoDAO candidatoDAO;
	private PaisDAO paisDAO;
	private PalabraClaveDAO palabraClaveDAO;
	
	private static ServicioCandidatos instancia;
	
	public static ServicioCandidatos getInstancia() {
		if (instancia == null) {
			instancia = new ServicioCandidatos();
		}
		return instancia;
	}
	
	private ServicioCandidatos() {
		super();
		this.candidatoDAO = CandidatoDAO.getInstancia();
		this.paisDAO = PaisDAO.getInstancia();
		this.palabraClaveDAO = PalabraClaveDAO.getInstancia();
	}
	
	public List<Candidato> getCandidatos() {
		List<Candidato> candidatos = this.candidatoDAO.queryAll(); 
		return candidatos;
	}
	
	public List<Pais> getPaises() {
		List<Pais> paises = this.paisDAO.queryAll();
//		Collections.sort(paises);
		return paises;
	}
	
	public List<PalabraClave> getPalabrasClave() {
		List<PalabraClave> palabrasClave = this.palabraClaveDAO.queryAll();
//		Collections.sort(palabrasClave);
		return palabrasClave;
	}
	
	public Candidato getCandidatoPorId(Serializable id) {
		if (id != null) {
			return this.candidatoDAO.get(id);
		}
		return null;
	}
	
	public Pais getPaisPorId(Serializable id) {
		if (id != null) { 
			return this.paisDAO.get(id);
		}
		return null;
	}
	
	public PalabraClave getPalabraClavePorId(Serializable id) {
		if (id != null) { 
			return this.palabraClaveDAO.get(id);
		}
		return null;
	}
	
	public Candidato incluirCandidato(Candidato candidato) {
		this.candidatoDAO.saveOrUpdate(candidato);
		return candidato;
	}

	public Candidato modificarCandidato(Integer id, Integer idPais, String contrasena, String contrasena_confirma,
			String foto_perfil, String nombre_candidato) {
		Candidato candidato = this.getCandidatoPorId(id);
		Pais pais = this.getPaisPorId(idPais);
//		candidato.setPais(pais);
//		candidato.setContrasena(contrasena);
//		candidato.setContrasena_confirma(contrasena_confirma);
//		candidato.setFoto_perfil(foto_perfil);
//		candidato.setNombre_candidato(nombre_candidato);
		this.candidatoDAO.saveOrUpdate(candidato);
		return this.getCandidatoPorId(id);
	}

	public String eliminarCandidato(Integer id) {
		Candidato candidato = this.getCandidatoPorId(id);
		if (candidato != null) {
			this.candidatoDAO.delete(candidato);
			return "ok";
		}
		return "No se pudo eliminar el candidato";
	}

}
