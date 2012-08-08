package am.clinicweb.to;

import javax.persistence.*;
/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */

@Entity
@Table(name="TB_ESPECIALIDADE")
@SequenceGenerator(name="especialidade", sequenceName="SEQ_ESPECIALIDADE",
allocationSize=1) 
public class EspecialidadeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="especialidade")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String nome;
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
