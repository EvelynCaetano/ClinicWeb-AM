<<<<<<< HEAD
package am.clinicweb.to;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
=======

package am.clinicweb.to;


>>>>>>> 27f3f4661ebb683a52aca36969a236f077210a40

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */

@Entity
@Table(name="TB_CIDADE")
@SequenceGenerator(name="cidade", sequenceName="SEQ_CIDADE",
allocationSize=1) 
public class CidadeEntity {


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="cidade")
	@Column(name="")
	private int id;
	
	
	@Column(name="")
	private String nome;
	
	@Column(name="")
	private EstadoEntity estado;
	
	
	public EstadoEntity getEstado() {
		return estado;
	}
	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
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
