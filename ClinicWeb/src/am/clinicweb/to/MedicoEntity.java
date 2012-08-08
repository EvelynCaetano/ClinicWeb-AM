package am.clinicweb.to;

import java.util.List;

import javax.persistence.*;

public class MedicoEntity extends PessoaEntity{

	@Id
	@Column(name="CRM")
	private String crm;
	
	@Column(name="COD_PESSOA_MEDICO")
	private int id_medico;
	
	@Column(name="")
	private List<EspecialidadeEntity> especialidades;
	
	@Column(name="")
	private List<DisponibilidadeMedicoEntity> diponibilidade;
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public int getId_medico() {
		return id_medico;
	}
	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}
	public List<EspecialidadeEntity> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<EspecialidadeEntity> especialidades) {
		this.especialidades = especialidades;
	}
	public List<DisponibilidadeMedicoEntity> getDiponibilidade() {
		return diponibilidade;
	}
	public void setDiponibilidade(List<DisponibilidadeMedicoEntity> diponibilidade) {
		this.diponibilidade = diponibilidade;
	}
	
	
}
