package br.com.fiap.cyrela.controller;

import br.com.fiap.cyrela.dto.AssistenciaDTO;
import br.com.fiap.cyrela.dto.Garantia;
import br.com.fiap.cyrela.service.AssistenciaServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssistenciaController {

    @Autowired
    AssistenciaServ assistenciaServ;

    @PostMapping("/assistencia")
    public String addAssistencia (@RequestBody AssistenciaDTO assistenciaDTO){
        assistenciaServ.save(assistenciaDTO);
        return "Assistencia incluída com sucesso!";
    }


    @GetMapping("/garantia/{pjoEmpreendId}")
    public ResponseEntity verificarGarantia(@PathVariable("pjoEmpreendId") Integer pjoEmpreendId) {
        try {
            Garantia prazo = assistenciaServ.buscarGarantia(pjoEmpreendId);
            return ResponseEntity.status(HttpStatus.OK).body(prazo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar prazo de garantia do empreendimento.");
        }
    }

    @PutMapping("/update-assistencia")
    public ResponseEntity <AssistenciaDTO> updateAssistencia(@RequestBody AssistenciaDTO assistencia){
        try{
            assistenciaServ.save(assistencia);
            return ResponseEntity.status(HttpStatus.OK).body(assistencia);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(assistencia);
        }
    }

}
