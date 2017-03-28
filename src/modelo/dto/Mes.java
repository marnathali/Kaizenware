package modelo.dto;

import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "mes")
public class Mes {
	
	@Id
	@Column(name = "numero")
	private Integer id; //numero del mes;
	
	private String mes;
	
	@OneToMany(mappedBy = "mes", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Asistencia> asistencias;
	
	@OneToMany(mappedBy = "mes", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<DiaFeriado> diasFeriados;
	
	@OneToMany(mappedBy = "mes", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Pago> pagos;
	
	@OneToMany(mappedBy = "mes", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Cobro> cobros;

	public Mes() {
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

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public List<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public List<DiaFeriado> getDiasFeriados() {
		return diasFeriados;
	}

	public void setDiasFeriados(List<DiaFeriado> diasFeriados) {
		this.diasFeriados = diasFeriados;
	}

	public List<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
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
		Mes other = (Mes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
