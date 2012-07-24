package am.clinicweb.interfaces;

import java.util.List;

import com.webclinic.entity.EspecialidadeEntity;

public interface EspecialidadeDAO {

	public EspecialidadeEntity consultar(int idEspecialidade);
	public List<EspecialidadeEntity> consultar();

}
