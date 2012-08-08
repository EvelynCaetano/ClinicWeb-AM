package am.clinicweb.to;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */

@Entity
@Table(name="")
@SequenceGenerator(name="pais", sequenceName="SEQ_PAIS",allocationSize=1) 
public class PaisEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pais")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String nome;
	
	private List<EstadoEntity> estados;

	public List<EstadoEntity> getEstados() {
		return estados;
	}
	public void setEstados(List<EstadoEntity> estados) {
		this.estados = estados;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
