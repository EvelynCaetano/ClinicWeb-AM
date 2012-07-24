package am.clinicweb.interfaces;

import java.util.Calendar;
import java.util.List;

import com.webclinic.entity.ConsultaEntity;

public interface ConsultaDAO {

	public void agendar(ConsultaEntity consulta);
	public void reagendar(ConsultaEntity consulta);
	public void cancelar(int idConsulta);
	
	public ConsultaEntity consultarAgenda(int idConsulta);
	public List<ConsultaEntity> consultarAgenda();
	public List<ConsultaEntity> consultarAgenda(Calendar dtInicio, Calendar dtFim);
	
}
