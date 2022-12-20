package pt.lunasoft.sge.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DOCUMENTO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Documento implements Serializable {

	private static final long serialVersionUID = 8604651295158931083L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "ID")
	private Integer id;
	
	@NotNull
	@Column(name = "TITULO")
	private String titulo;
	
	@NotNull
	@Column(name = "ZONA")
	private String zona;
	
	@NotNull
	@Column(name = "SECAO")
	private String secao;
	
	@NotNull
	@Column(name = "LOCAL_VOTACAO")
	private String localVotacao;

	public Documento(Integer id) {
		this.id = id;
	}

	public Documento(Integer id, String titulo, String zona, String secao, String localVotacao) {
		this.id = id;
		this.titulo = titulo;
		this.zona = zona;
		this.secao = secao;
		this.localVotacao = localVotacao;
	}

}