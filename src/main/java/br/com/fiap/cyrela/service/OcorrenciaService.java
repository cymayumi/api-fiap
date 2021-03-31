package br.com.fiap.cyrela.service;

import br.com.fiap.cyrela.entity.OcorrenciaEntity;
import br.com.fiap.cyrela.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaEntity buscarListaOcorrencias(Integer ticketNumber) {

        Optional<OcorrenciaEntity> resultBusca = ocorrenciaRepository.findById(ticketNumber);

        if (resultBusca.isEmpty()) {
           return null;
        }
        return resultBusca.get();
    }
}