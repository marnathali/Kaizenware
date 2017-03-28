package modelo.dto;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "entrevista")
public class Entrevista implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_entrevista", sequenceName="secuencia_entrevista")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_entrevista")
	private Integer id;
	
	private Calendar fecha;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_entrevista")
	private TipoEntrevista tipoEntrevista;
	
	private String entrevistador;
	
	private Float evaluacion;
	
	private String observaciones;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_candidato")
	private Candidato candidato;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cargo")
	private Cargo cargo;

	public Entrevista() {
		super();
	}

	public Integer getId() {
		return id;
	}
	
	public String getIdString() {
		if (this.id == null) {
			return null;
		}
		return this.id.toString().replaceAll("\\.", "");
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getFecha() {
		return fecha;
	}
	
	public String getFechaString() {
		Integer dia = fecha.get(Calendar.DATE);
		Integer mes = fecha.get(Calendar.MONTH) + 1;
		Integer ano = fecha.get(Calendar.YEAR);
		return  dia.toString() + "/" + mes.toString() + "/" + ano.toString();
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public TipoEntrevista getTipoEntrevista() {
		return tipoEntrevista;
	}

	public void setTipoEntrevista(TipoEntrevista tipoEntrevista) {
		this.tipoEntrevista = tipoEntrevista;
	}

	public String getEntrevistador() {
		return entrevistador;
	}

	public void setEntrevistador(String entrevistador) {
		this.entrevistador = entrevistador;
	}

	public Float getEvaluacion() {
		return evaluacion;
	}
	
	public String getEvaluacionString() {
		return evaluacion.toString();
	}

	public void setEvaluacion(Float evaluacion) {
		this.evaluacion = evaluacion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrevista other = (Entrevista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entrevista [id=" + id + ", fecha=" + fecha + ", tipoEntrevista=" + tipoEntrevista + ", entrevistador="
				+ entrevistador + ", evaluacion=" + evaluacion + ", observaciones=" + observaciones + ", candidato="
				+ candidato + ", cargo=" + cargo + "]";
	}

}
