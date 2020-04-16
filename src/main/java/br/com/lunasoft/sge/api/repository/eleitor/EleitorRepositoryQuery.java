package br.com.lunasoft.sge.api.repository.eleitor;

import java.util.List;

import br.com.lunasoft.sge.api.model.Eleitor;
import br.com.lunasoft.sge.api.repository.filter.Filtro;

public interface EleitorRepositoryQuery {

	public List<Eleitor> filtrar(Filtro filtro);
	
}