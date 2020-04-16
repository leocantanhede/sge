package br.com.lunasoft.sge.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Endereco implements Serializable {

	private static final long serialVersionUID = 3943708127850906763L;

	@NotNull
	@Column(name = "LOGRADOURO")
	private String logradouro;
	
	@NotNull
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@NotNull
	@Column(name = "BAIRRO")
	private String bairro;
	
	@NotNull
	@Column(name = "CEP")
	private String cep;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name ="ESTADO")
	private Estado estado;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name ="CIDADE")
	private Cidade cidade;

}