package pt.lunasoft.sge.api.repository.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Filtro {

	private String nome;
	private Short zona;
	private Short secao;
	
	public Filtro(String nome, Short zona, Short secao) {
		this.nome = nome;
		this.zona = zona;
		this.secao = secao;
	}
		
}