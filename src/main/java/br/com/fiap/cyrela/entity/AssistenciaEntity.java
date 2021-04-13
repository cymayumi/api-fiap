package br.com.fiap.cyrela.entity;

import br.com.fiap.cyrela.dto.AssistenciaDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_ASSISTENCIA")
public class AssistenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AGENDAMENTO")
    private Integer idAgendamento;

    @Column(name = "ACTUAL_START")
    private Date dtStart;

    @Column(name = "ACTUAL_END")
    private Date dtEnd;

    @Column(name = "PJO_TIPO_DE_ATIVIDADE")
    private String pjoTipoAtv;

    @Column(name = "SUBJECT")
    private String subject;

    @Column(name = "PJO_EMPREENDIMENTO_ID")
    private Integer pjoEmpreendId;

    @Column(name = "PJO_BLOCO_ID")
    private Integer pjoBlocoId;

    @Column(name = "PJO_UNIDADE_ID")
    private Integer pjoUnidadeId;


    public AssistenciaEntity (AssistenciaDTO assistenciaDTO){

    }
}
