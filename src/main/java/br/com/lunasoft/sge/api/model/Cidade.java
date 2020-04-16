package br.com.lunasoft.sge.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CIDADE")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Cidade implements Serializable {

	private static final long serialVersionUID = -864090400077852842L;
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name ="ESTADO")
	private Estado estado;
	
	public Cidade(Integer id, String nome, Estado estado) {
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}

}