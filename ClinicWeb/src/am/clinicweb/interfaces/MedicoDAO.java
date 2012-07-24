package am.clinicweb.interfaces;

import java.util.List;

import com.webclinic.entity.MedicoEntity;

public interface MedicoDAO {

	public void cadastrar(MedicoEntity medico);
	public void atualizar(MedicoEntity medico);
	public MedicoEntity consultar(int id);
	public List<MedicoEntity> consultar();
	public List<MedicoEntity> consultarPorEspecialidade(int idEspecialidade);
}
