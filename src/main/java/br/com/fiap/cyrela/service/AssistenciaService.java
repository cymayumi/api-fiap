package br.com.fiap.cyrela.service;

import br.com.fiap.cyrela.dto.Garantia;
import br.com.fiap.cyrela.entity.AssistenciaEntity;
import br.com.fiap.cyrela.repository.AssistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssistenciaService {

    @Autowired
    AssistenciaRepository assistenciaRepository;

    public Garantia buscarGarantia(Integer pjoEmpreendId) {
        AssistenciaEntity resultBusca = assistenciaRepository.findByPjoEmpreendId(pjoEmpreendId);

        Garantia garantia = new Garantia();
        garantia.setDtStart(resultBusca.getDtStart());
        garantia.setDtEnd(resultBusca.getDtEnd());

        return garantia;
    }
}
