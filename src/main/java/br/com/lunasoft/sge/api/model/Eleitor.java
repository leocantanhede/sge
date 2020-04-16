package br.com.lunasoft.sge.api.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ELEITOR")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Eleitor implements Serializable {

	private static final long serialVersionUID = -967214804146564304L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "ID")
	private Integer id;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@Column(name = "DATA_NASCIMENTO")
	private LocalDate dataNascimento;
	
	@Column(name = "PAI")
	private String nomePai;
	
	@Column(name = "MAE")
	private String nomeMae;
	
	@NotNull
	@Embedded
	private Endereco endereco;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="DOCUMENTO")
	private Documento documento;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="CONTATO")
	private Contato contato;

	public Eleitor(Integer id, String nome, LocalDate dataNascimento, String nomePai, String nomeMae, Endereco endereco,
			Documento documento, Contato contato) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.endereco = endereco;
		this.documento = documento;
		this.contato = contato;
	}
	
}