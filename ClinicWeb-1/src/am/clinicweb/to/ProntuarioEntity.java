package am.clinicweb.to;

import java.util.List;

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */


public class ProntuarioEntity {

	private int id;
	private PacienteEntity paciente;
	private List<ConsultaEntity> consultas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PacienteEntity getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteEntity paciente) {
		this.paciente = paciente;
	}
	public List<ConsultaEntity> getConsultas() {
		return consultas;
	}
	public void setConsultas(List<ConsultaEntity> consultas) {
		this.consultas = consultas;
	}
	
	
}
