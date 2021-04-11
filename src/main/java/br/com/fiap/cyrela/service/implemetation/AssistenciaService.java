package br.com.fiap.cyrela.service.implemetation;

import br.com.fiap.cyrela.dto.AssistenciaDTO;
import br.com.fiap.cyrela.dto.Garantia;
import br.com.fiap.cyrela.entity.AssistenciaEntity;
import br.com.fiap.cyrela.repository.AssistenciaRepository;
import br.com.fiap.cyrela.service.AssistenciaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssistenciaService implements AssistenciaServ {

    @Autowired
    AssistenciaRepository assistenciaRepository;

    @Override
    public void save(AssistenciaDTO assistencia) {
        AssistenciaEntity assistenciaEntity = new AssistenciaEntity(assistencia);
        assistenciaRepository.save(assistenciaEntity);

    }

    public Garantia buscarGarantia(Integer pjoEmpreendId) {
        Optional<AssistenciaEntity> resultBusca = assistenciaRepository.findById(pjoEmpreendId);

        Garantia garantia = new Garantia();
        garantia.setDtStart(resultBusca.get().getDtStart());
        garantia.setDtEnd(resultBusca.get().getDtEnd());
        return garantia;
    }


}
