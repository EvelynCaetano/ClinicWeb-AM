package am.clinicweb.interfaces;

import am.clinicweb.to.ProntuarioEntity;
@Deprecated
public interface ProntuarioDAO {

	public void cadastrar(ProntuarioEntity prontuario);
	public ProntuarioEntity consultar(int idProntuario);
}
