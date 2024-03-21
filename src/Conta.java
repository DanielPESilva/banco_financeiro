

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Conta {
    private LocalDateTime dataEmissao;
    private LocalDateTime dataVencimento;
    private LocalDateTime dataPgto;
    private BigDecimal valor;
    private String statusPagamento;
    private int responsavelId;
    private int erpLctoHistoricoId;
    private Integer erpFormaPagamentoId;
    private String observacao;
    private String active;

    public Conta(LocalDateTime dataEmissao, LocalDateTime dataVencimento, LocalDateTime dataPgto, BigDecimal valor, String statusPagamento, int responsavelId, int erpLctoHistoricoId, Integer erpFormaPagamentoId, String observacao, String active) {
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.dataPgto = dataPgto;
        this.valor = valor;
        this.statusPagamento = statusPagamento;
        this.responsavelId = responsavelId;
        this.erpLctoHistoricoId = erpLctoHistoricoId;
        this.erpFormaPagamentoId = erpFormaPagamentoId;
        this.observacao = observacao;
        this.active = active;
    }

    public LocalDateTime getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDateTime getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDateTime getDataPgto() {
        return this.dataPgto;
    }

    public void setDataPgto(LocalDateTime dataPgto) {
        this.dataPgto = dataPgto;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getStatusPagamento() {
        return this.statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public int getResponsavelId() {
        return this.responsavelId;
    }

    public void setResponsavelId(int responsavelId) {
        this.responsavelId = responsavelId;
    }

    public int getErpLctoHistoricoId() {
        return this.erpLctoHistoricoId;
    }

    public void setErpLctoHistoricoId(int erpLctoHistoricoId) {
        this.erpLctoHistoricoId = erpLctoHistoricoId;
    }

    public Integer getErpFormaPagamentoId() {
        return this.erpFormaPagamentoId;
    }

    public void setErpFormaPagamentoId(Integer erpFormaPagamentoId) {
        this.erpFormaPagamentoId = erpFormaPagamentoId;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getActive() {
        return this.active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
