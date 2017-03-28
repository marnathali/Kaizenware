package modelo.dto;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "habilidad")
public class Habilidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="generador_id_habilidad", sequenceName="secuencia_habilidad")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_habilidad")
	private Integer id;
	
	private String habilidad;

	public Habilidad() {
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

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
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
		Habilidad other = (Habilidad) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "habilidad [id=" + id + ", habilidad=" + habilidad + "]";
	}
	
	
}
