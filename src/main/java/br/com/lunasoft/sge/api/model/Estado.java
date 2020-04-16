package br.com.lunasoft.sge.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ESTADO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Estado implements Serializable {

	private static final long serialVersionUID = 915362255450579591L;
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@Column(name = "UF")
	private String uf;
	
	public Estado(Integer id) {
		this.id = id;
	}
	
	public Estado(Integer id, String nome, String uf) {
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}
	
}