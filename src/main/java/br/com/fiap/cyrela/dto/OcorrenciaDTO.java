package br.com.fiap.cyrela.dto;



import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class OcorrenciaDTO {

    private Integer idAgendamento;
    private Date dtStart;
    private Date dtEnd;
    private String pjoTipoAtv;
    private String subject;
    private Integer pjoEmpreendId;
    private Integer pjoBlocoId;
    private Integer pjoUnidadeId;
}
