package br.com.fiap.cyrela.service;

import br.com.fiap.cyrela.dto.OcorrenciaDTO;
import br.com.fiap.cyrela.entity.OcorrenciaEntity;


public interface OcorrenciaServ {

    void save(OcorrenciaDTO ocorrencia);

    OcorrenciaEntity buscarListaOcorrencias(Integer ticketNumber);
}
