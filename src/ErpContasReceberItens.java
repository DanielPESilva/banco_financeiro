import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class ErpContasReceberItens {
    private int id;
    private String descricao;
    private double valor;
    private ErpContasReceber erp_contas_receber_id;
    private LocalDateTime lancamento;

    public ErpContasReceberItens(int id, String descricao, double valor, ErpContasReceber erp_contas_receber_id, LocalDateTime lancamento) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.erp_contas_receber_id = erp_contas_receber_id;
        this.lancamento = lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ErpContasReceber getErp_contas_receber_id() {
        return erp_contas_receber_id;
    }

    public void setErp_contas_receber_id(ErpContasReceber erp_contas_receber_id) {
        this.erp_contas_receber_id = erp_contas_receber_id;
    }

    public LocalDateTime getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDateTime lancamento) {
        this.lancamento = lancamento;
    }
}
