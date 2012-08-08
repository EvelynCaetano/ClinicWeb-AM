package am.clinicweb.to;

import java.util.Calendar;

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
@Table(name="TB_CONSULTA")
@SequenceGenerator(name="consulta", sequenceName="SEQ_CONSULTA",
allocationSize=1) 

public class ConsultaEntity {
	//Autor: Eduardo
	//Data Criação: 14/07/12
	//Versão: 1.0
	//  
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="consulta")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private ProntuarioEntity prontuario;
	
	@Column(name="")
	private MedicoEntity medico;
	
	@Column(name="")
	private Calendar dataCadatro;
	
	@Column(name="")
	private Calendar dataConsulta;
	
	@Column(name="")
	private boolean confirmacao;	
	
	@Column(name="")
	private String laudo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProntuarioEntity getProntuario() {
		return prontuario;
	}
	public void setProntuario(ProntuarioEntity prontuario) {
		this.prontuario = prontuario;
	}
	public MedicoEntity getMedico() {
		return medico;
	}
	public void setMedico(MedicoEntity medico) {
		this.medico = medico;
	}
	public Calendar getDataCadatro() {
		return dataCadatro;
	}
	public void setDataCadatro(Calendar dataCadatro) {
		this.dataCadatro = dataCadatro;
	}
	public Calendar getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public boolean isConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(boolean confirmacao) {
		this.confirmacao = confirmacao;
	}
	public String getLaudo() {
		return laudo;
	}
	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}	
	
}
