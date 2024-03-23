import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ErpContasReceber {
    private int id;
    private LocalDateTime data_emissao;
    private LocalDateTime data_vencimento;
    private LocalDateTime data_recebimento;
    private  double valor;
    private String status_pagamento;
    private String chave_nfe;
    private Responsavel responsavel_id;
    private ErpLctoHistorico erp_lcto_historico_id;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private String conta_credito;
    private String observacao;
    private char active;
    private LocalDateTime datetime;
    private char transferido_tesouraria;
    private double calcularValor;

    public ErpContasReceber(int id, LocalDateTime data_emissao, LocalDateTime data_vencimento, LocalDateTime data_recebimento, double valor, String status_pagamento, String chave_nfe, Responsavel responsavel_id, ErpLctoHistorico erp_lcto_historico_id, ErpFormaPagamento erp_forma_pagamento_id, String conta_credito, String observacao, char active, LocalDateTime datetime, char transferido_tesouraria) {
        this.id = id;
        this.data_emissao = data_emissao;
        this.data_vencimento = data_vencimento;
        this.data_recebimento = data_recebimento;
        this.valor = valor;
        this.status_pagamento = status_pagamento;
        this.chave_nfe = chave_nfe;
        this.responsavel_id = responsavel_id;
        this.erp_lcto_historico_id = erp_lcto_historico_id;
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
        this.conta_credito = conta_credito;
        this.observacao = observacao;
        this.active = active;
        this.datetime = datetime;
        this.transferido_tesouraria = transferido_tesouraria;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(LocalDateTime data_emissao) {
        this.data_emissao = data_emissao;
    }

    public LocalDateTime getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDateTime data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public LocalDateTime getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(LocalDateTime data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public String getChave_nfe() {
        return chave_nfe;
    }

    public void setChave_nfe(String chave_nfe) {
        this.chave_nfe = chave_nfe;
    }

    public Responsavel getResponsavel_id() {
        return responsavel_id;
    }

    public void setResponsavel_id(Responsavel responsavel_id) {
        this.responsavel_id = responsavel_id;
    }

    public ErpLctoHistorico getErp_lcto_historico_id() {
        return erp_lcto_historico_id;
    }

    public void setErp_lcto_historico_id(ErpLctoHistorico erp_lcto_historico_id) {
        this.erp_lcto_historico_id = erp_lcto_historico_id;
    }

    public double calcularValor (double desconto,double juros) {
        double valorcalculado = this.valor;
        double valordescontado = valorcalculado - desconto;
        double valoradionad = valorcalculado + juros;

    }

    public ErpFormaPagamento getErp_forma_pagamento_id() {
        return erp_forma_pagamento_id;
    }

    public void setErp_forma_pagamento_id(ErpFormaPagamento erp_forma_pagamento_id) {
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
    }

    public String getConta_credito() {
        return conta_credito;
    }

    public void setConta_credito(String conta_credito) {
        this.conta_credito = conta_credito;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public char getTransferido_tesouraria() {
        return transferido_tesouraria;
    }

    public void setTransferido_tesouraria(char transferido_tesouraria) {
        this.transferido_tesouraria = transferido_tesouraria;
    }
}
