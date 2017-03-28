package modelo.dto;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "divisa")
public class Divisa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_divisa", sequenceName="secuencia_divisa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_divisa")
	private Integer id;
	
	private String divisa;

	public Divisa() {
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

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
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
		Divisa other = (Divisa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Divisa [id=" + id + ", divisa=" + divisa + "]";
	}
	
}
