package br.com.fiap.cyrela.repository;

import br.com.fiap.cyrela.entity.AssistenciaEntity;
import br.com.fiap.cyrela.entity.OcorrenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<OcorrenciaEntity, Integer> {
}
