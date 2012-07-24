package am.clinicweb.to;

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
@SequenceGenerator(name="tipoContato", sequenceName="SEQ_TIPO_CONTATO",
allocationSize=1) 
public class TipoContatoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="tipoContato")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String nome;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
