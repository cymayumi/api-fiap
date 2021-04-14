package br.com.fiap.cyrela.entity;

import br.com.fiap.cyrela.dto.OcorrenciaDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_OCORRENCIA")
public class OcorrenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TICKET_NUMBER")
    private Integer ticketNumber;

    @Column(name = "PJO_CLIENTE_DA_UNIDADE")
    private String pjoClienteUnidade;

    @Column(name = "PJO_EMPREENDIMENTO_ID")
    private Integer pjoEmpreendId;

    @Column(name = "PJO_BLOCO")
    private Integer pjoBloco;

    @Column(name = "PJO_UNIDADE")
    private Integer pjoUnidade;

    @Column(name = "PJO_BANDEIRA")
    private String pjoBandeira;

    @Column(name = "DESCRIPTION")
    private String description;

    public OcorrenciaEntity(OcorrenciaDTO ocorrenciaDTO){
        this.description = ocorrenciaDTO.getDescription();
        this.pjoBandeira = ocorrenciaDTO.getPjoBandeira();
        this.pjoBloco = ocorrenciaDTO.getPjoBloco();
        this.pjoClienteUnidade = ocorrenciaDTO.getPjoClienteUnidade();
        this.pjoEmpreendId = ocorrenciaDTO.getPjoEmpreendId();
        this.pjoUnidade = ocorrenciaDTO.getPjoUnidade();
        this.ticketNumber = ocorrenciaDTO.getTicketNumber();

    }
}
