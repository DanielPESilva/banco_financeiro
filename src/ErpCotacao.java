import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ErpCotacao {
    private int id;
    private String finalidade;
    private ErpPessoaFornecedor erp_pessoa_fornecedor_id;
    private LocalDateTime vencimento_proposta;
    private double valor_total;
    private char active;
    private  LocalDateTime data_lancamento;

    public ErpCotacao(int id, String finalidade, ErpPessoaFornecedor erp_pessoa_fornecedor_id, LocalDateTime vencimento_proposta, double valor_total, char active, LocalDateTime data_lancamento) {
        this.id = id;
        this.finalidade = finalidade;
        this.erp_pessoa_fornecedor_id = erp_pessoa_fornecedor_id;
        this.vencimento_proposta = vencimento_proposta;
        this.valor_total = valor_total;
        this.active = active;
        this.data_lancamento = data_lancamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public ErpPessoaFornecedor getErp_pessoa_fornecedor_id() {
        return erp_pessoa_fornecedor_id;
    }

    public void setErp_pessoa_fornecedor_id(ErpPessoaFornecedor erp_pessoa_fornecedor_id) {
        this.erp_pessoa_fornecedor_id = erp_pessoa_fornecedor_id;
    }

    public LocalDateTime getVencimento_proposta() {
        return vencimento_proposta;
    }

    public void setVencimento_proposta(LocalDateTime vencimento_proposta) {
        this.vencimento_proposta = vencimento_proposta;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}
