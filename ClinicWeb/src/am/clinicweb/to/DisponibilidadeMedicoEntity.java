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
@Table(name="TB_DISPONIBILIDADE_MEDICO")
@SequenceGenerator(name="disponibilidade", sequenceName="SEQ_DISPONIBILIDADE",
allocationSize=1) 


public class DisponibilidadeMedicoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="disponibildade")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String diaSemana;
	
	@Column(name="")
	private Calendar dataInicio;
	
	@Column(name="")
	private Calendar dataFim;
	
	@Column(name="")
	private MedicoEntity medico;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public MedicoEntity getMedico() {
		return medico;
	}
	public void setMedico(MedicoEntity medico) {
		this.medico = medico;
	}
	
	
	
	
}
