package br.com.lunasoft.sge.api.repository.eleitor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.util.StringUtils;

import br.com.lunasoft.sge.api.model.Eleitor;
import br.com.lunasoft.sge.api.repository.filter.Filtro;

public class EleitorRepositoryImpl implements EleitorRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Eleitor> filtrar(Filtro filtro) {		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT e FROM Eleitor e ");
		sb.append("JOIN e.documento d ");
		sb.append("JOIN e.contato c ");
		sb.append("WHERE 1 = 1 ");
		
		if (!StringUtils.isEmpty(filtro.getNome())) {
			sb.append("AND LOWER(e.nome) LIKE CONCAT('%', CONCAT(LOWER(:nome),'%'))");
		}
		if (filtro.getZona() != null) {
			sb.append("AND e.documento.zona = :zona ");
		}
		if (filtro.getSecao() != null) {
			sb.append("AND e.documento.secao = :secao ");
		}
		
		TypedQuery<Eleitor> query = this.manager.createQuery(sb.toString(), Eleitor.class);
		
		if (!StringUtils.isEmpty(filtro.getNome())) {
			query.setParameter("nome", filtro.getNome());
		}
		if (filtro.getZona() != null) {
			query.setParameter("zona", filtro.getZona());
		}
		if (filtro.getSecao() != null) {
			query.setParameter("secao", filtro.getSecao());
		}
		
		return query.getResultList();
	}

}
