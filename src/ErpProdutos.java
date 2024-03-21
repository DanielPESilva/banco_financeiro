import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ErpProdutos {
    private int id;
    private String nome;
    private String descricao;
    private ErpTipoProduto erp_tipo_produto_id;
    private ErpUnidadeMedida erp_unidade_medida_id;
    private char active;
    private double valor_medio;
    private LocalDateTime data_lancamento;

    public ErpProdutos(int id, String nome, String descricao, ErpTipoProduto erp_tipo_produto_id, ErpUnidadeMedida erp_unidade_medida_id, char active, double valor_medio, LocalDateTime data_lancamento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.erp_tipo_produto_id = erp_tipo_produto_id;
        this.erp_unidade_medida_id = erp_unidade_medida_id;
        this.active = active;
        this.valor_medio = valor_medio;
        this.data_lancamento = data_lancamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ErpTipoProduto getErp_tipo_produto_id() {
        return erp_tipo_produto_id;
    }

    public void setErp_tipo_produto_id(ErpTipoProduto erp_tipo_produto_id) {
        this.erp_tipo_produto_id = erp_tipo_produto_id;
    }

    public ErpUnidadeMedida getErp_unidade_medida_id() {
        return erp_unidade_medida_id;
    }

    public void setErp_unidade_medida_id(ErpUnidadeMedida erp_unidade_medida_id) {
        this.erp_unidade_medida_id = erp_unidade_medida_id;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public double getValor_medio() {
        return valor_medio;
    }

    public void setValor_medio(double valor_medio) {
        this.valor_medio = valor_medio;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
}
