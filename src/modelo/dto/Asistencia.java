package modelo.dto;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "asistencia")
public class Asistencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="generador_id_asistencia", sequenceName="secuencia_asistencia")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generador_id_asistencia")
	private Integer id;
	
	private Integer horas_trabajadas;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "mes")
	private Mes mes;
	
	private Integer anio;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_candidato")
	private Candidato candidato;
	

	public Asistencia() {
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

	public Integer getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(Integer horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
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
		Asistencia other = (Asistencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Asistencia [id=" + id + ", horas_trabajadas=" + horas_trabajadas + ", mes=" + mes + ", anio=" + anio
				+ ", candidato=" + candidato.getId() + "]";
	}
	
}
