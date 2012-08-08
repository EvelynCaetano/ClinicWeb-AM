package am.clinicweb.to;

import javax.persistence.*;


/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */


@Entity
@Table(name="TB_PACIENTE")
public class PacienteEntity extends PessoaEntity{

	@Column(name="COD_PESSOA")
	private int id_paciente;
	
	@Column(name="COD_PRONTUARIO")
	private ProntuarioEntity prontuario;

	
	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public ProntuarioEntity getProntuario() {
		return prontuario;
	}

	public void setProntuario(ProntuarioEntity prontuario) {
		this.prontuario = prontuario;
	}
	
}
