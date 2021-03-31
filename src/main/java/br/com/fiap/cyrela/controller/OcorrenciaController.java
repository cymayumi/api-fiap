package br.com.fiap.cyrela.controller;

import br.com.fiap.cyrela.entity.OcorrenciaEntity;
import br.com.fiap.cyrela.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @GetMapping("/ocorrencia/{ticketNumber}")
    public ResponseEntity buscarOcorrenciaComprador(@PathVariable("ticketNumber") Integer ticketNumber) {
        try {
            OcorrenciaEntity ocorrencia = ocorrenciaService.buscarListaOcorrencias(ticketNumber);
            return ResponseEntity.status(HttpStatus.OK).body(ocorrencia);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar ocorrencias.");
        }
    }
}
