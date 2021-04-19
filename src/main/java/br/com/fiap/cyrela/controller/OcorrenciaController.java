package br.com.fiap.cyrela.controller;

import br.com.fiap.cyrela.dto.OcorrenciaDTO;
import br.com.fiap.cyrela.entity.OcorrenciaEntity;
import br.com.fiap.cyrela.service.OcorrenciaServ;
import br.com.fiap.cyrela.service.implemetation.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class OcorrenciaController {

    @Autowired
    OcorrenciaServ ocorrenciaServ;

    @PostMapping("/ocorrencia")
    public String addOcorrencia(@RequestBody OcorrenciaDTO ocorrencia){
    ocorrenciaServ.save(ocorrencia);
    return "Ocorrencia incluída!";
    }

    @GetMapping("/ocorrencia/{ticketNumber}")
    public ResponseEntity buscarOcorrenciaComprador(@PathVariable("ticketNumber") Integer ticketNumber) {
        try {
            OcorrenciaEntity ocorrencia = ocorrenciaServ.buscarListaOcorrencias(ticketNumber);
            return ResponseEntity.status(HttpStatus.OK).body(ocorrencia);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar ocorrencias.");
        }
    }

    @PutMapping("update-ocorrencia")
    public ResponseEntity updateOcorrencia(@RequestBody OcorrenciaDTO ocorrencia){
        try{
            ocorrenciaServ.save(ocorrencia);
            return ResponseEntity.status(HttpStatus.OK).body("Ocorrencia atualizada");
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao atualizar ocorrencia");
        }
    }
}
