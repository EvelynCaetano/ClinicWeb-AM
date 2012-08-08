package am.clinicweb.interfaces;

import java.util.List;

import am.clinicweb.to.FuncionarioEntity;
@Deprecated
public interface FuncionarioDAO {

	public void cadastrar(FuncionarioEntity funcionario);
	public void atualizar(FuncionarioEntity funcionario);
	public FuncionarioEntity consultar(int id);
	public List<FuncionarioEntity> consultar();
	
}
