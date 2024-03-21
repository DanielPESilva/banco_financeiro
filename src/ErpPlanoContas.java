import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class ErpPlanoContas {
    private int id;
    private String conta;
    private String descricao;
    private char active;
    private LocalDateTime data_lancamento;
    private String tipo_conta;
    private String nivel_hierarquico;
    private LocalDateTime data_inicio;
    private double saldo_inicial;

    public ErpPlanoContas(int id, String conta, String descricao, char active, LocalDateTime data_lancamento, String tipo_conta, String nivel_hierarquico, LocalDateTime data_inicio, double saldo_inicial) {
        this.id = id;
        this.conta = conta;
        this.descricao = descricao;
        this.active = active;
        this.data_lancamento = data_lancamento;
        this.tipo_conta = tipo_conta;
        this.nivel_hierarquico = nivel_hierarquico;
        this.data_inicio = data_inicio;
        this.saldo_inicial = saldo_inicial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getNivel_hierarquico() {
        return nivel_hierarquico;
    }

    public void setNivel_hierarquico(String nivel_hierarquico) {
        this.nivel_hierarquico = nivel_hierarquico;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public double getSaldo_inicial() {
        return saldo_inicial;
    }

    public void setSaldo_inicial(double saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }
}
