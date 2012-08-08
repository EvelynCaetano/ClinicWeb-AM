package am.clinicweb.to;

import javax.persistence.*;

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */

@Entity
@Table(name="")
@SequenceGenerator(name="tipoLogradouro", sequenceName="SEQ_TIPO_LOGRADOURO",
allocationSize=1) 

public class TipoLogradouro {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="tipoLogradouro")
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
