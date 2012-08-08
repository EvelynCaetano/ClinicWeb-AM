package am.clinicweb.to;

import javax.persistence.*;

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */

@Entity
@Table(name="TB_CARGO")
@SequenceGenerator(name="cargo", sequenceName="SEQ_CARGO",
allocationSize=1) 
public class CargoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="cargo")
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
