package br.com.fiap.cyrela.repository;

import br.com.fiap.cyrela.entity.AssistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistenciaRepository extends JpaRepository<AssistenciaEntity, Integer> {


}
