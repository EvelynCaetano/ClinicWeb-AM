package am.clinicweb.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */


@Entity
@Table(name="TB_PACIENTE")
public class PacienteEntity extends PessoaEntity{

	@Column(name="")
	private ProntuarioEntity prontuario;

	public ProntuarioEntity getProntuario() {
		return prontuario;
	}

	public void setProntuario(ProntuarioEntity prontuario) {
		this.prontuario = prontuario;
	}
	
	
	
}
