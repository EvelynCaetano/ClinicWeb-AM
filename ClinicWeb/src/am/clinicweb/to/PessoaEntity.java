package am.clinicweb.to;

import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */


@Entity
@Table(name="TB_PESSOA")
@SequenceGenerator(name="pessoa", sequenceName="SEQ_PESSOA",
allocationSize=1) 
public class PessoaEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="pessoa")
	@Column(name="COD_PESSOA")
	private int id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="SOBRENOME")
	private String sobrenome;
	
	@Column(name="")
	private Calendar dtNascimento;
	
	@Column(name="SEXO")
	private char sexo;
	
	@Column(name="CPF")
	private long cpf;
	
	@Column(name="RG")
	private String rg;
	
	@Column(name="COD_PERFIL")
	private PerfilAcessoEntity perfil;

	@Column(name="")
	private List<ContatoEntity> contatos;
	
	@Column(name="COD_ENDERECO")
	private List<EnderecoEntity> enderecos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Calendar getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public PerfilAcessoEntity getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilAcessoEntity perfil) {
		this.perfil = perfil;
	}
	public List<ContatoEntity> getContatos() {
		return contatos;
	}
	public void setContatos(List<ContatoEntity> contatos) {
		this.contatos = contatos;
	}
	public List<EnderecoEntity> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<EnderecoEntity> enderecos) {
		this.enderecos = enderecos;
	}
	
	
}
