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
@Table(name = "CONTATO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Contato implements Serializable {

	private static final long serialVersionUID = 3962878458900942577L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@NotNull
	@Column(name = "CELULAR")
	private String celular;
	
	@Column(name = "EMAIL", columnDefinition = "VARCHAR(50)")
	private String email;
	
	public Contato(Integer id) {
		this.id = id;
	}
	
	public Contato(Integer id, String telefone, String celular, String email) {
		this.id = id;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}
	
}