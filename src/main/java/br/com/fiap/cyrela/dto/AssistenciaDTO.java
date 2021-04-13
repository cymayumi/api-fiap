package br.com.fiap.cyrela.dto;


import br.com.fiap.cyrela.entity.AssistenciaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssistenciaDTO {


    private Integer idAgendamento;
    private Date dtStart;
    private Date dtEnd;
    private String pjoTipoAtv;
    private String subject;
    private Integer pjoEmpreendId;
    private Integer pjoBlocoId;
    private Integer pjoUnidadeId;


}
