package br.com.fiap.cyrela.service;

import br.com.fiap.cyrela.dto.AssistenciaDTO;
import br.com.fiap.cyrela.dto.Garantia;


public interface AssistenciaServ {

    Garantia buscarGarantia(Integer pjoEmpreendId);

    void save (AssistenciaDTO assistencia);



}
