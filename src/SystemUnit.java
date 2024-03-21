public class SystemUnit {
    private int id;
    private String code;
    private String name;
    private String connection_name;
    private String address_zone;
    private String address_street;
    private String address_number;
    private String address_district;
    private  IbgeMunicipio ibge_municipio_id;
    private String telephone;
    private  String email;
    private char active;
    private String custom_code;

    public SystemUnit(int id, String code, String name, String connection_name, String address_zone, String address_street, String address_number, String address_district, IbgeMunicipio ibge_municipio_id, String telephone, String email, char active, String custom_code) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.connection_name = connection_name;
        this.address_zone = address_zone;
        this.address_street = address_street;
        this.address_number = address_number;
        this.address_district = address_district;
        this.ibge_municipio_id = ibge_municipio_id;
        this.telephone = telephone;
        this.email = email;
        this.active = active;
        this.custom_code = custom_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnection_name() {
        return connection_name;
    }

    public void setConnection_name(String connection_name) {
        this.connection_name = connection_name;
    }

    public String getAddress_zone() {
        return address_zone;
    }

    public void setAddress_zone(String address_zone) {
        this.address_zone = address_zone;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getAddress_number() {
        return address_number;
    }

    public void setAddress_number(String address_number) {
        this.address_number = address_number;
    }

    public String getAddress_district() {
        return address_district;
    }

    public void setAddress_district(String address_district) {
        this.address_district = address_district;
    }

    public IbgeMunicipio getIbge_municipio_id() {
        return ibge_municipio_id;
    }

    public void setIbge_municipio_id(IbgeMunicipio ibge_municipio_id) {
        this.ibge_municipio_id = ibge_municipio_id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public String getCustom_code() {
        return custom_code;
    }

    public void setCustom_code(String custom_code) {
        this.custom_code = custom_code;
    }
}
