package modelo.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_cliente", sequenceName="secuencia_cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_cliente")
	private Integer id;
	
	private String nombre;
	
	private String nom_contacto;
	
	private String tlf_contacto;
	
	private String correo; 
	
	private String correo_contacto;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Proyecto> proyectos;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Cobro> cobros;
	
	public Cliente() {
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNom_contacto() {
		return nom_contacto;
	}

	public void setNom_contacto(String nom_contacto) {
		this.nom_contacto = nom_contacto;
	}

	public String getTlf_contacto() {
		return tlf_contacto;
	}

	public void setTlf_contacto(String tlf_contacto) {
		this.tlf_contacto = tlf_contacto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreo_contacto() {
		return correo_contacto;
	}

	public void setCorreo_contacto(String correo_contacto) {
		this.correo_contacto = correo_contacto;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public List<Cobro> getCobros() {
		return cobros;
	}

	public void setCobros(List<Cobro> cobros) {
		this.cobros = cobros;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", nom_contacto=" + nom_contacto + ", tlf_contacto="
				+ tlf_contacto + ", correo=" + correo + ", correo_contacto=" + correo_contacto + ", pais=" + pais
				+ ", proyectos=" + proyectos + ", cobros=" + cobros + "]";
	}
	 
}
