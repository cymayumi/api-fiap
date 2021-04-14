package br.com.fiap.cyrela.dto;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class OcorrenciaDTO {

    private Integer ticketNumber;
    private String pjoClienteUnidade;
    private Integer pjoEmpreendId;
    private Integer pjoBloco;
    private Integer pjoUnidade;
    private String pjoBandeira;
    private String description;
}
