package am.clinicweb.interfaces;

import java.util.List;

import am.clinicweb.to.PessoaEntity;

@Deprecated
public interface PessoaDAO {

	public void cadastrar(PessoaEntity paciente);
	public void atualizar(PessoaEntity paciente);
	public PessoaEntity consultar(int id);
	public List<PessoaEntity> consultar();
}
