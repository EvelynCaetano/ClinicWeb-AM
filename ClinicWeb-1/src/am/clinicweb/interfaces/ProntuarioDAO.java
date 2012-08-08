package am.clinicweb.interfaces;

import am.clinicweb.to.ProntuarioEntity;

public interface ProntuarioDAO {

	public void cadastrar(ProntuarioEntity prontuario);
	public ProntuarioEntity consultar(int idProntuario);
}
