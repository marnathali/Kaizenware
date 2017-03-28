package modelo.dto;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "falta")
public class Falta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_falta", sequenceName="secuencia_falta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_falta")
	private Integer id;
	
	private Integer horas_faltadas;
	
	private Calendar fecha;
	
	private Integer tipo_falta;
	
	private String descripcion;
	
	private String constancia;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_candidato")
	private Candidato candidato;

	public Falta() {
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

	public Integer getHoras_faltadas() {
		return horas_faltadas;
	}
	
	public String getHorasFaltadasString() {
		return horas_faltadas.toString();
	}

	public void setHoras_faltadas(Integer horas_faltadas) {
		this.horas_faltadas = horas_faltadas;
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

	public Integer getTipo_falta() {
		return tipo_falta;
	}
	
	public String getTipoFaltaString() {
		switch(tipo_falta) {
			case 1 : return "No justificada";
			case 2 : return "Justificada";
			default : return "";
		}
	}

	public void setTipo_falta(Integer tipo_falta) {
		this.tipo_falta = tipo_falta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getConstancia() {
		return constancia;
	}

	public void setConstancia(String constancia) {
		this.constancia = constancia;
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
		Falta other = (Falta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Falta [id=" + id + ", horas_faltadas=" + horas_faltadas + ", fecha=" + getFechaString() + ", tipo_falta="
				+ getTipoFaltaString() + ", descripcion=" + descripcion + ", constancia=" + constancia + ", candidato="
				+ candidato.getId() + "]";
	}
	
	

}
