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
@Table(name="TB_CONTATO")
@SequenceGenerator(name="contato", sequenceName="SEQ_CONTATO",
allocationSize=1) 

public class ContatoEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="contato")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
