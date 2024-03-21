public class IbgeMunicipio {
    private int id;
    private String codigo;
    private String nome;
    private String cidade_correspondente;
    private IbgeEstado ibge_estado_id;
    private String cep;

    public IbgeMunicipio(int id, String codigo, String nome, String cidade_correspondente, IbgeEstado ibge_estado_id, String cep) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.cidade_correspondente = cidade_correspondente;
        this.ibge_estado_id = ibge_estado_id;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade_correspondente() {
        return cidade_correspondente;
    }

    public void setCidade_correspondente(String cidade_correspondente) {
        this.cidade_correspondente = cidade_correspondente;
    }

    public IbgeEstado getIbge_estado_id() {
        return ibge_estado_id;
    }

    public void setIbge_estado_id(IbgeEstado ibge_estado_id) {
        this.ibge_estado_id = ibge_estado_id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
