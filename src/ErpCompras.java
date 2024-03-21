import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class ErpCompras {
    public ErpCompras(int id, String numero_requisicao, SystemUsers membro_comprador_system_users_id, ErpFormaPagamento erp_destinacao_recurso_id, ErpCotacao erp_cotacao_id, Double valor_total, ErpStatusCompra erp_status_compra_id, String active, LocalDateTime data_lancamento) {
        this.id = id;
        this.numero_requisicao = numero_requisicao;
        this.membro_comprador_system_users_id = membro_comprador_system_users_id;
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
        this.erp_cotacao_id = erp_cotacao_id;
        this.valor_total = valor_total;
        this.erp_status_compra_id = erp_status_compra_id;
        this.active = active;
        this.data_lancamento = data_lancamento;
    }

    private int id;
    private String numero_requisicao;
    private SystemUsers membro_comprador_system_users_id;
    private ErpFormaPagamento erp_destinacao_recurso_id;
    private ErpCotacao erp_cotacao_id;
    private Double valor_total;
    private ErpStatusCompra erp_status_compra_id;
    private String active;
    private LocalDateTime data_lancamento;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_requisicao() {
        return numero_requisicao;
    }

    public void setNumero_requisicao(String numero_requisicao) {
        this.numero_requisicao = numero_requisicao;
    }

    public SystemUsers getMembro_comprador_system_users_id() {
        return membro_comprador_system_users_id;
    }

    public void setMembro_comprador_system_users_id(SystemUsers membro_comprador_system_users_id) {
        this.membro_comprador_system_users_id = membro_comprador_system_users_id;
    }

    public ErpFormaPagamento getErp_destinacao_recurso_id() {
        return erp_destinacao_recurso_id;
    }

    public void setErp_destinacao_recurso_id(ErpFormaPagamento erp_destinacao_recurso_id) {
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
    }

    public ErpCotacao getErp_cotacao_id() {
        return erp_cotacao_id;
    }

    public void setErp_cotacao_id(ErpCotacao erp_cotacao_id) {
        this.erp_cotacao_id = erp_cotacao_id;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public ErpStatusCompra getErp_status_compra_id() {
        return erp_status_compra_id;
    }

    public void setErp_status_compra_id(ErpStatusCompra erp_status_compra_id) {
        this.erp_status_compra_id = erp_status_compra_id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}
