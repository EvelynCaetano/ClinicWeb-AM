package am.clinicweb.interfaces;

import java.util.List;

import am.clinicweb.to.EspecialidadeEntity;
@Deprecated
public interface EspecialidadeDAO {

	public EspecialidadeEntity consultar(int idEspecialidade);
	public List<EspecialidadeEntity> consultar();

}
