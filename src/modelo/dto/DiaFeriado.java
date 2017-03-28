package modelo.dto;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "dia_feriado")
public class DiaFeriado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_dia_feriado", sequenceName="secuencia_dia_feriado")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_dia_feriado")
	private Integer id;
	
	private Integer dia;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "mes")
	private Mes mes;
	
	private String nombre;

	public DiaFeriado() {
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

	public Integer getDia() {
		return dia;
	}
	
	public String getDiaString() {
		return dia.toString();
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		DiaFeriado other = (DiaFeriado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiaFeriado [id=" + id + ", dia=" + dia + ", mes=" + mes + ", nombre=" + nombre + "]";
	}
	
	
	
}
