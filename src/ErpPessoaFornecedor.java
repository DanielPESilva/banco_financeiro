import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class ErpPessoaFornecedor {
    private int id;
    private String cnpj;
    private String responsavel;

    private String contato;

    private String telefones;

    private String fantasia;

    private String razao_social;
    private char active;
    private LocalDateTime data_lancamento;

    public ErpPessoaFornecedor(int id, String cnpj, String responsavel, String contato, String telefones, String fantasia, String razao_social, char active, LocalDateTime data_lancamento) {
        this.id = id;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.contato = contato;
        this.telefones = telefones;
        this.fantasia = fantasia;
        this.razao_social = razao_social;
        this.active = active;
        this.data_lancamento = data_lancamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefones) {
        this.telefones = telefones;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
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
