public class IbgeLongradouros {
    private int id;
    private String num_cep;
    private IbgeBairro ibge_bairro_id;
    private String desc_logradouro;
    private String desc_tipo;

    public IbgeLongradouros(int id, String num_cep, IbgeBairro ibge_bairro_id, String desc_logradouro, String desc_tipo) {
        this.id = id;
        this.num_cep = num_cep;
        this.ibge_bairro_id = ibge_bairro_id;
        this.desc_logradouro = desc_logradouro;
        this.desc_tipo = desc_tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_cep() {
        return num_cep;
    }

    public void setNum_cep(String num_cep) {
        this.num_cep = num_cep;
    }

    public IbgeBairro getIbge_bairro_id() {
        return ibge_bairro_id;
    }

    public void setIbge_bairro_id(IbgeBairro ibge_bairro_id) {
        this.ibge_bairro_id = ibge_bairro_id;
    }

    public String getDesc_logradouro() {
        return desc_logradouro;
    }

    public void setDesc_logradouro(String desc_logradouro) {
        this.desc_logradouro = desc_logradouro;
    }

    public String getDesc_tipo() {
        return desc_tipo;
    }

    public void setDesc_tipo(String desc_tipo) {
        this.desc_tipo = desc_tipo;
    }
}
