package modelo.dto;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name= "usuario")

public class Usuario implements Serializable
{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  @SequenceGenerator(name="usuario_id_generador", sequenceName="secuencia_usuario")
	  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario_id_generador")
	private Integer id;
  private String nombre_usuario;
  private String contrasena;
  private String contrasena_confirma;
  private String foto_perfil;
  @ManyToOne(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
  @JoinColumn(name = "id_rol")
  private Rol rol;

  
  
  
  
  public Integer getId(){
	  return id;
	  
  }
  
  public String getIdString()
  {
	  if (this.id == null) {
			return null;
		}
		return this.id.toString().replaceAll("\\.", "");
  }
  
  public void setId(Integer id) {
      this.id = id;
  }

  
  
  public Rol getRol() {
      return rol;
  }

  public String getIdRolString()
  {
	  if (this.getRol() != null) {
			return this.getRol().getIdString();
		}
		return "-1";
  }
  public void setRol(Rol rol) {
      this.rol = rol;
  }
  
  public String getNombre_usuario() {
	return nombre_usuario;
}

public void setNombre_usuario(String nombre_usuario) {
	this.nombre_usuario = nombre_usuario;
}

public String getContrasena() {
	return contrasena;
}

public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}

public String getContrasena_confirma() {
	return contrasena_confirma;
}

public void setContrasena_confirma(String contrasena_confirma) {
	this.contrasena_confirma = contrasena_confirma;
}

public String getFoto_perfil() {
	return foto_perfil;
}

public void setFoto_perfil(String foto_perfil) {
	this.foto_perfil = foto_perfil;
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
	Usuario other = (Usuario) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}


  


}
