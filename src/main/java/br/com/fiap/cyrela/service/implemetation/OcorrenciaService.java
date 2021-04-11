package br.com.fiap.cyrela.service.implemetation;

import br.com.fiap.cyrela.dto.OcorrenciaDTO;
import br.com.fiap.cyrela.entity.OcorrenciaEntity;
import br.com.fiap.cyrela.repository.OcorrenciaRepository;
import br.com.fiap.cyrela.service.OcorrenciaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService implements OcorrenciaServ {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    @Override
    public void save(OcorrenciaDTO ocorrencia) {
        OcorrenciaEntity ocorrenciaEntity = new OcorrenciaEntity(ocorrencia);
        ocorrenciaRepository.save(ocorrenciaEntity);
    }

    public OcorrenciaEntity buscarListaOcorrencias(Integer ticketNumber) {
        OcorrenciaEntity resultBusca = ocorrenciaRepository.findById(ticketNumber).get();
        return resultBusca;
    }
}
