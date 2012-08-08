package am.clinicweb.to;

import java.util.List;

import javax.persistence.*;

/** 
 * @author Eduardo Michels
 * @since 14/07/2012
 * @version 1.0
 */

@Entity
@Table(name="TB_ESTADO")
@SequenceGenerator(name="estado", sequenceName="SEQ_ESTADO",
allocationSize=1) 
public class EstadoEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="estado")
	@Column(name="COD_ESTADO")
	private int id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="COD_PAIS")
	private PaisEntity pais;

	private List<CidadeEntity> cidades;
	
	
	public PaisEntity getPais() {
		return pais;
	}
	public void setPais(PaisEntity pais) {
		this.pais = pais;
	}
	public List<CidadeEntity> getCidades() {
		return cidades;
	}
	public void setCidades(List<CidadeEntity> cidades) {
		this.cidades = cidades;
	}
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
	
	
}
