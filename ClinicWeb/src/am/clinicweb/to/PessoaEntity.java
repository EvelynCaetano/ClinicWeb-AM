package am.clinicweb.to;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String nome;
	
	@Column(name="")
	private String sobrenome;
	
	@Column(name="")
	private Calendar dtNascimento;
	
	@Column(name="")
	private char sexo;
	
	@Column(name="")
	private long cpf;
	
	@Column(name="")
	private String rg;
	
	@Column(name="")
	private PerfilAcessoEntity perfil;

	@Column(name="")
	private List<ContatoEntity> contatos;
	
	@Column(name="")
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
