package br.com.lunasoft.sge.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lunasoft.sge.api.model.Eleitor;
import br.com.lunasoft.sge.api.repository.eleitor.EleitorRepositoryQuery;

public interface EleitorRepository extends JpaRepository<Eleitor, Integer>, EleitorRepositoryQuery {

}