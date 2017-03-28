package modelo.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "generador_id_candidato", sequenceName = "secuencia_candidato")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generador_id_candidato")
	private Integer id;
	
	private String nombres;
	
	private String apellidos;
	
	private String telefono;
	
	private String correo;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	private String ciudad;
	
	private Character sexo;
	
	private String curriculum;
	
	private Integer estado;
	
	@OneToMany(mappedBy = "candidato", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Asistencia> asistenciasMensuales;

	@OneToMany(mappedBy = "candidato", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Falta> faltas;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "candidato_palabra_clave", 
			   joinColumns = {@JoinColumn(name="id_candidato")}, 
			   inverseJoinColumns = {@JoinColumn(name = "id_palabra_clave")})
	@Fetch(value = FetchMode.SUBSELECT)
	private List<PalabraClave> palabrasClaves;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_candidato")
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Habilidad> habilidades;
	
	@OneToMany(mappedBy = "candidato", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Cargo> cargos;
	
	public Candidato() {
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

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

	public Integer getEstado() {
		return estado;
	}
	
	public String getEstadoString() {
		switch(estado) {
			case 1: return "Candidato";
			case 2: return "Empleado";
			default: return "";
		}
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public List<Asistencia> getAsistenciasMensuales() {
		return asistenciasMensuales;
	}

	public void setAsistenciasMensuales(List<Asistencia> asistenciasMensuales) {
		this.asistenciasMensuales = asistenciasMensuales;
	}

	public List<Falta> getFaltas() {
		return faltas;
	}

	public void setFaltas(List<Falta> faltas) {
		this.faltas = faltas;
	}

	public List<PalabraClave> getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(List<PalabraClave> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
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
		Candidato other = (Candidato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", correo=" + correo + ", pais=" + pais + ", ciudad=" + ciudad + ", sexo=" + sexo + ", curriculum="
				+ curriculum + ", estado=" + estado + ", asistenciasMensuales=" + asistenciasMensuales + ", faltas="
				+ faltas + ", palabrasClaves=" + palabrasClaves + ", habilidades=" + habilidades + ", cargos=" + cargos
				+ "]";
	}

		
		
}
