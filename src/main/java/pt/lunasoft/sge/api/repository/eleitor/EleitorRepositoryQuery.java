package pt.lunasoft.sge.api.repository.eleitor;

import java.util.List;

import pt.lunasoft.sge.api.model.Eleitor;
import pt.lunasoft.sge.api.repository.filter.Filtro;

public interface EleitorRepositoryQuery {

	public List<Eleitor> filtrar(Filtro filtro);
	
}