package modelo.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "cargo")
public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="generador_id_cargo", sequenceName="secuencia_cargo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generador_id_cargo")
	private Integer id;
	
	private String nombre;
	
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_cargo")
	private TipoCargo tipoCargo;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_proyecto")
	private Proyecto proyecto;
	
	private Float remuneracion;
	
	private Float monto_cobro; // Representa el monto que debe pagar el cliente por el cargo
	
	private Integer tipo_remuneracion; //1:En base a horas  -  2:En base a salario mensual
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_divisa")
	private Divisa divisa;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_candidato")
	private Candidato candidato;
	
	@OneToMany(mappedBy = "cargo", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Pago> pagos;

	public Cargo() {
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

	public TipoCargo getTipoCargo() {
		return tipoCargo;
	}

	public void setTipoCargo(TipoCargo tipoCargo) {
		this.tipoCargo = tipoCargo;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Float getRemuneracion() {
		return remuneracion;
	}
	
	public String getRemuneracionString() {
		return remuneracion.toString();
	}

	public void setRemuneracion(Float remuneracion) {
		this.remuneracion = remuneracion;
	}

	public Float getMonto_cobro() {
		return monto_cobro;
	}
	
	public String getMontoCobroString() {
		return monto_cobro.toString();
	}

	public void setMonto_cobro(Float monto_cobro) {
		this.monto_cobro = monto_cobro;
	}

	public Integer getTipo_remuneracion() {
		return tipo_remuneracion;
	}
	
	public String getTipoRemuneracionString() {
		 switch(tipo_remuneracion){
		 	 case 1: return "En base a horas";
			 case 2: return "En base a salario mensual";
			 default: return ""; 
		}
	}

	public void setTipo_remuneracion(Integer tipo_remuneracion) {
		this.tipo_remuneracion = tipo_remuneracion;
	}

	public Divisa getDivisa() {
		return divisa;
	}

	public void setDivisa(Divisa divisa) {
		this.divisa = divisa;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public List<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
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
		Cargo other = (Cargo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipoCargo=" + tipoCargo
				+ ", proyecto=" + proyecto + ", remuneracion=" + remuneracion + ", monto_cobro=" + monto_cobro
				+ ", tipo_remuneracion=" + tipo_remuneracion + ", divisa=" + divisa + ", candidato=" + candidato
				+ ", pagos=" + pagos + "]";
	}
	
}
