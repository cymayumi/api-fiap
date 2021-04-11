package br.com.fiap.cyrela.service.implematation;

import br.com.fiap.cyrela.entity.OcorrenciaEntity;
import br.com.fiap.cyrela.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaEntity buscarListaOcorrencias(Integer ticketNumber) {

        OcorrenciaEntity resultBusca = ocorrenciaRepository.findById(ticketNumber).get();

        return resultBusca;

    }
}
