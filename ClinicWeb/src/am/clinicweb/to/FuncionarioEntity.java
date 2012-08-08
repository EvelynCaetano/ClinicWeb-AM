package am.clinicweb.to;

import javax.persistence.*;


@Entity
@Table(name="TB_PACIENTE")
public class FuncionarioEntity extends PessoaEntity {
	
	
	@Id
	@Column(name="COD_PESSOA_FUNCIONARIO")
	private int id_funcionario;
	
	@Column(name="SALARIO")
	private String salario;
	
	@Column(name="COD_CARGO")
	private String id_cargo;
	
	

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(String id_cargo) {
		this.id_cargo = id_cargo;
	}
	
	
	
}
