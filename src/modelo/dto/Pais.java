package modelo.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "pais")
public class Pais implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="generador_id_pais", sequenceName = "secuencia_pais")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generador_id_pais")
	private Integer id;
	
	private String pais;
	
	@OneToMany(mappedBy = "pais", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Candidato> candidatos;
	
	//private List<Cliente> clientes;
	
	public Pais() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
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
		Pais other = (Pais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pais [id=" + id + ", pais=" + pais + "]";
	}
	
}
