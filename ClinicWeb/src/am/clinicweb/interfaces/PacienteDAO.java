package am.clinicweb.interfaces;

import java.util.List;

import com.webclinic.entity.PacienteEntity;

public interface PacienteDAO {

	public void cadastrar(PacienteEntity paciente);
	public void atualizar(PacienteEntity paciente);
	public PacienteEntity consultar(int id);
	public List<PacienteEntity> consultar();
}
