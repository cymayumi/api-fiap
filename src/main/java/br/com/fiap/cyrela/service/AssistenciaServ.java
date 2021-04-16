package br.com.fiap.cyrela.service;

import br.com.fiap.cyrela.dto.AssistenciaDTO;
import br.com.fiap.cyrela.dto.GarantiaDTO;


public interface AssistenciaServ {

    GarantiaDTO buscarGarantia(Integer pjoEmpreendId);

    void save (AssistenciaDTO assistencia);



}
