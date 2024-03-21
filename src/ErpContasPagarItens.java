import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ErpContasPagarItens {
    private int id;
    private String descricao;
    private double valor;
    private ErpContasPagar erp_contas_pagar_id;
    private LocalDateTime lacamento;

    public ErpContasPagarItens(int id, String descricao, double valor, ErpContasPagar erp_contas_pagar_id, LocalDateTime lacamento) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.erp_contas_pagar_id = erp_contas_pagar_id;
        this.lacamento = lacamento;
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

    public ErpContasPagar getErp_contas_pagar_id() {
        return erp_contas_pagar_id;
    }

    public void setErp_contas_pagar_id(ErpContasPagar erp_contas_pagar_id) {
        this.erp_contas_pagar_id = erp_contas_pagar_id;
    }

    public LocalDateTime getLacamento() {
        return lacamento;
    }

    public void setLacamento(LocalDateTime lacamento) {
        this.lacamento = lacamento;
    }
}
