package pt.lunasoft.sge.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.lunasoft.sge.api.model.Eleitor;
import pt.lunasoft.sge.api.repository.eleitor.EleitorRepositoryQuery;

public interface EleitorRepository extends JpaRepository<Eleitor, Integer>, EleitorRepositoryQuery {

}