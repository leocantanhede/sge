package br.com.lunasoft.sge.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lunasoft.sge.api.model.Cidade;
import br.com.lunasoft.sge.api.model.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	public List<Cidade> findByEstado(Estado estado);
	
}