package am.clinicweb.interfaces;

import java.util.List;

import am.clinicweb.to.PacienteEntity;
@Deprecated
public interface PacienteDAO {

	public void cadastrar(PacienteEntity paciente);
	public void atualizar(PacienteEntity paciente);
	public PacienteEntity consultar(int id);
	public List<PacienteEntity> consultar();
}
