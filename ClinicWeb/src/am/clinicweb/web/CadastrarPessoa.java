package am.clinicweb.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.faces.event.ValueChangeEvent;

import am.clinicweb.dao.DAO;
import am.clinicweb.to.EnderecoEntity;
import am.clinicweb.to.FuncionarioEntity;
import am.clinicweb.to.MedicoEntity;
import am.clinicweb.to.PacienteEntity;
import am.clinicweb.to.PessoaEntity;


@ManagedBean(name = "c")
@RequestScoped
public class CadastrarPessoa {

	private int tipoCadastro;
	private boolean camposPaciente = false;
	private boolean camposMedico = false;
	private boolean camposFuncionario = false;
	private PessoaEntity pessoa = new PessoaEntity();
	private EnderecoEntity endereco = new EnderecoEntity();
	private PacienteEntity paciente = new PacienteEntity();
	private MedicoEntity medico = new MedicoEntity();
	private FuncionarioEntity funcionario = new FuncionarioEntity();	

	public void btnCadastrar() {
		DAO<PessoaEntity> pessoaDAO = new DAO<PessoaEntity>(PessoaEntity.class);
		FacesMessage msg;
		FacesContext contexto;
		
		

		switch (tipoCadastro) {
		case 1:
			pessoaDAO.cadastrar(getPessoa());
		
			DAO<PacienteEntity> pacienteDAO = new DAO<PacienteEntity>(PacienteEntity.class);
			pacienteDAO.cadastrar(getPaciente());
			msg = new FacesMessage("Paciente cadastrado com sucesso!");
			contexto = FacesContext.getCurrentInstance();
			contexto.addMessage("", msg);
			break;

		case 2:
			pessoaDAO.cadastrar(getPessoa());
			
			DAO<MedicoEntity> medicoDAO = new DAO<MedicoEntity>(MedicoEntity.class);
			medicoDAO.cadastrar(getMedico());
			msg = new FacesMessage("Medico cadastrado com sucesso!");
			contexto = FacesContext.getCurrentInstance();
			contexto.addMessage("", msg);
			
			break;

		case 3:
			pessoaDAO.cadastrar(getPessoa());
			
			DAO<FuncionarioEntity> funcionarioDAO = new DAO<FuncionarioEntity>(FuncionarioEntity.class);
			funcionarioDAO.cadastrar(getFuncionario());
			msg = new FacesMessage("Funcionario cadastrado com sucesso!");
			contexto = FacesContext.getCurrentInstance();
			contexto.addMessage("", msg);
			
			break;

		default:
			msg = new FacesMessage("Você deve escolher um tipo de cadastro!");
			contexto = FacesContext.getCurrentInstance();
			contexto.addMessage("", msg);
			break;
		}	
		

	}

	
	public void mostraCampos(ValueChangeEvent event) {

		PhaseId phaseId = event.getPhaseId();

		if (phaseId.equals(PhaseId.ANY_PHASE)) {

			event.setPhaseId(PhaseId.UPDATE_MODEL_VALUES);
			event.queue();
		}

		System.out.println("AKI  " + getTipoCadastro());

		switch (tipoCadastro) {
		case 1:
			camposPaciente = true;
			camposMedico = false;
			camposFuncionario = false;
			break;

		case 2:
			camposMedico = true;
			camposFuncionario = false;
			camposPaciente = false;
			break;

		case 3:
			camposMedico = false;
			camposPaciente = false;
			camposFuncionario = true;
			break;

		default:
			break;
		}

		

	}
	
	
	
	public boolean isCamposPaciente() {
		return camposPaciente;
	}


	public void setCamposPaciente(boolean camposPaciente) {
		this.camposPaciente = camposPaciente;
	}


	public boolean isCamposMedico() {
		return camposMedico;
	}


	public void setCamposMedico(boolean camposMedico) {
		this.camposMedico = camposMedico;
	}


	public boolean isCamposFuncionario() {
		return camposFuncionario;
	}


	public void setCamposFuncionario(boolean camposFuncionario) {
		this.camposFuncionario = camposFuncionario;
	}


	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	public PacienteEntity getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteEntity paciente) {
		this.paciente = paciente;
	}

	public MedicoEntity getMedico() {
		return medico;
	}

	public void setMedico(MedicoEntity medico) {
		this.medico = medico;
	}

	public FuncionarioEntity getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioEntity funcionario) {
		this.funcionario = funcionario;
	}
	
	public int getTipoCadastro() {
		return tipoCadastro;
	}

	public void setTipoCadastro(int tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}
	
	public EnderecoEntity getEndereco() {
		return endereco;
	}


	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	
	

}

/*
 * 
 * 
 * import com.fiap.dao.DAO; import com.fiap.to.ClienteTO;
 * 
 * @ManagedBean(name="c")
 * 
 * @RequestScoped public class CadastroClienteBean {
 * 
 * private ClienteTO cliente = new ClienteTO();
 * 
 * private boolean desabilitarCampo = true;
 * 
 * public boolean isDesabilitarCampo() { return desabilitarCampo; }
 * 
 * public void btnRemover(){ DAO<ClienteTO> clienteDAO = new
 * DAO<ClienteTO>(ClienteTO.class); clienteDAO.remove(getCliente());
 * setCliente(new ClienteTO()); }
 * 
 * public void btnAlterar() { DAO<ClienteTO> clienteDAO = new
 * DAO<ClienteTO>(ClienteTO.class); clienteDAO.atualiza(getCliente());
 * setCliente(new ClienteTO()); }
 * 
 * public void btnIncluir(){ DAO<ClienteTO> clienteDAO = new
 * DAO<ClienteTO>(ClienteTO.class);
 * 
 * try {
 * 
 * ClienteTO cli = clienteDAO.buscaPorId(cliente.getCodCliente());
 * 
 * if (cli != null) { FacesMessage msg = new
 * FacesMessage("Cliente já existente"); FacesContext contexto =
 * FacesContext.getCurrentInstance(); contexto.addMessage("", msg); } else {
 * clienteDAO.adiciona(getCliente()); FacesMessage msg = new
 * FacesMessage("Cliente cadastrado com sucesso!"); FacesContext contexto =
 * FacesContext.getCurrentInstance(); contexto.addMessage("", msg); }
 * }catch(Exception e){ FacesMessage msg = new
 * FacesMessage("Erro no cadastramento do cliente."); FacesContext contexto =
 * FacesContext.getCurrentInstance(); contexto.addMessage("", msg);
 * e.printStackTrace(); }
 * 
 * setCliente(new ClienteTO()); }
 * 
 * public void btnPesquisar() { DAO<ClienteTO> clienteDAO = new
 * DAO<ClienteTO>(ClienteTO.class);
 * setCliente(clienteDAO.buscaPorId(cliente.getCodCliente()));
 * 
 * //desabilitarCampo = false;
 * 
 * if (cliente == null) { FacesMessage msg = new
 * FacesMessage("Cliente não encontrado"); FacesContext contexto =
 * FacesContext.getCurrentInstance(); contexto.addMessage("", msg);
 * 
 * cliente = new ClienteTO(); cliente.setLatitude("-23.57417");
 * cliente.setLongitude("-46.623094"); desabilitarCampo = true; } }
 * 
 * public ClienteTO getCliente() { return cliente; }
 * 
 * public void setCliente(ClienteTO cliente) { this.cliente = cliente; } }
 */
