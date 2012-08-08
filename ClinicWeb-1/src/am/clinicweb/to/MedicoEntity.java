package am.clinicweb.to;

import java.util.List;

import javax.persistence.Column;

public class MedicoEntity extends PessoaEntity{

	@Column(name="")
	private String crm;
	
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
