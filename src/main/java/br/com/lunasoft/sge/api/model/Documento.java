package br.com.lunasoft.sge.api.model;

import java.io.Serializable;
import java.time.LocalDate;

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
	@Column(name = "IDENTIDADE")
	private String identidade;
	
	@NotNull
	@Column(name = "EMISSOR")
	private String emissor;
	
	@NotNull
	@Column(name = "DATA_EXPEDICAO")
	private LocalDate dataExpedicao;
	
	@NotNull
	@Column(name = "CPF")
	private String cpf;
	
	@NotNull
	@Column(name = "TITULO")
	private String titulo;
	
	@NotNull
	@Column(name = "ZONA")
	private Short zona;
	
	@NotNull
	@Column(name = "SECAO")
	private Short secao;
	
	@NotNull
	@Column(name = "MUNICIPIO_UF")
	private String municipioUf;

	public Documento(Integer id) {
		this.id = id;
	}
	
	public Documento(Integer id, String identidade, String emissor, LocalDate dataExpedicao, String cpf, String titulo,
			Short zona, Short secao, String municipioUf) {
		this.id = id;
		this.identidade = identidade;
		this.emissor = emissor;
		this.dataExpedicao = dataExpedicao;
		this.cpf = cpf;
		this.titulo = titulo;
		this.zona = zona;
		this.secao = secao;
		this.municipioUf = municipioUf;
	}
	
}