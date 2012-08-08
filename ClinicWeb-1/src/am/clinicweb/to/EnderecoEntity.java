package am.clinicweb.to;

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
@Table(name="TB_ENDERECO")
@SequenceGenerator(name="endereco", sequenceName="SEQ_ENDERECO",
allocationSize=1) 

public class EnderecoEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="endereco")
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String logradouro;
	
	@Column(name="")
	private TipoLogradouro tipoLogradouro;
	
	@Column(name="")
	private int numero;
	
	@Column(name="")
	private int cep;
	
	@Column(name="")
	private CidadeEntity cidade;
	
	@Column(name="")
	private String complemento;
	
	@Column(name="")
	private PessoaEntity pessoa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public CidadeEntity getCidade() {
		return cidade;
	}
	public void setCidade(CidadeEntity cidade) {
		this.cidade = cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public PessoaEntity getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
