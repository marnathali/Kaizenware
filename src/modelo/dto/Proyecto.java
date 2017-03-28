package modelo.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_proyecto", sequenceName="secuencia_proyecto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_proyecto")
	private Integer id;
	
	private String nombre;
	
	private String descripcion;
	
	private Calendar fecha_registro;
	
	private Integer estado; // 1:Activo - 2:Finalizado
	
	private Calendar fecha_finalizado; // Se carga este campo automáticamente cuando el proyecto se ha finalizado
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "proyecto", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Cargo> cargos;
	
	@OneToMany(mappedBy = "proyecto", fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Cobro> cobros;

	public Proyecto() {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Calendar getFecha_registro() {
		return fecha_registro;
	}

	public String getFechaRegistroString() {
		Integer dia = fecha_registro.get(Calendar.DATE);
		Integer mes = fecha_registro.get(Calendar.MONTH) + 1;
		Integer ano = fecha_registro.get(Calendar.YEAR);
		return  dia.toString() + "/" + mes.toString() + "/" + ano.toString();
	}
	
	public void setFecha_registro(Calendar fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Calendar getFecha_finalizado() {
		return fecha_finalizado;
	}

	public String getFechaFinalizadoString() {
		Integer dia = fecha_finalizado.get(Calendar.DATE);
		Integer mes = fecha_finalizado.get(Calendar.MONTH) + 1;
		Integer ano = fecha_finalizado.get(Calendar.YEAR);
		return  dia.toString() + "/" + mes.toString() + "/" + ano.toString();
	}
	
	public void setFecha_finalizado(Calendar fecha_finalizado) {
		this.fecha_finalizado = fecha_finalizado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
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
		Proyecto other = (Proyecto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_registro="
				+ fecha_registro + ", estado=" + estado + ", fecha_finalizado=" + fecha_finalizado + ", cliente="
				+ cliente + ", cargos=" + cargos + ", cobros=" + cobros + "]";
	}
	
	
}
