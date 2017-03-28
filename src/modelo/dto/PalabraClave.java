package modelo.dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "palabra_clave")
public class PalabraClave {
	
		private static final long serialVersionUID = 1L;

		@Id
		@SequenceGenerator(name="generador_id_palabra_clave", sequenceName="secuencia_palabra_clave")
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generador_id_palabra_clave")
		private Integer id;

		private String palabra;
		
		@ManyToMany(cascade = CascadeType.ALL, mappedBy="palabrasClaves", fetch = FetchType.LAZY)
		@Fetch(value = FetchMode.SUBSELECT)
		private List<Candidato> candidatos;


		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getIdString()
		{
			if (this.id == null) {
				return null;
			}
			return this.id.toString().replaceAll("\\.", "");
		}

		public String getPalabra() {
			return palabra;
		}

		public void setPalabra(String palabra) {
			this.palabra = palabra;
		}

		public List<Candidato> getCandidatos() {
			return candidatos;
		}

		public void setCandidatos(List<Candidato> candidatos) {
			this.candidatos = candidatos;
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
			PalabraClave other = (PalabraClave) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "PalabraClave [id=" + id + ", palabra=" + palabra + ", candidatos=" + candidatos + "]";
		}

}
