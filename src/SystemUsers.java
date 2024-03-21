public class SystemUsers {
    private int id;
    private String name;
    private String email;
    private String site;
    private String login;
    private String password;
    private SystemUnit system_unit_id;
    private FrontPage frontpage_id;
    private String photo_path;
    private char active;
    private char accepted_term_policy;
    private String accepted_term_policy_at;
    private String accepted_term_policy_data;
    private String phone;
    private String address;
    private String about;
    private String function_name;
    private String custom_code;
    private String otp_secret;

    public SystemUsers(int id, String name, String email, String site, String login, String password, SystemUnit system_unit_id, FrontPage frontpage_id, String photo_path, char active, char accepted_term_policy, String accepted_term_policy_at, String accepted_term_policy_data, String phone, String address, String about, String function_name, String custom_code, String otp_secret) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.site = site;
        this.login = login;
        this.password = password;
        this.system_unit_id = system_unit_id;
        this.frontpage_id = frontpage_id;
        this.photo_path = photo_path;
        this.active = active;
        this.accepted_term_policy = accepted_term_policy;
        this.accepted_term_policy_at = accepted_term_policy_at;
        this.accepted_term_policy_data = accepted_term_policy_data;
        this.phone = phone;
        this.address = address;
        this.about = about;
        this.function_name = function_name;
        this.custom_code = custom_code;
        this.otp_secret = otp_secret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SystemUnit getSystem_unit_id() {
        return system_unit_id;
    }

    public void setSystem_unit_id(SystemUnit system_unit_id) {
        this.system_unit_id = system_unit_id;
    }

    public FrontPage getFrontpage_id() {
        return frontpage_id;
    }

    public void setFrontpage_id(FrontPage frontpage_id) {
        this.frontpage_id = frontpage_id;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public char getAccepted_term_policy() {
        return accepted_term_policy;
    }

    public void setAccepted_term_policy(char accepted_term_policy) {
        this.accepted_term_policy = accepted_term_policy;
    }

    public String getAccepted_term_policy_at() {
        return accepted_term_policy_at;
    }

    public void setAccepted_term_policy_at(String accepted_term_policy_at) {
        this.accepted_term_policy_at = accepted_term_policy_at;
    }

    public String getAccepted_term_policy_data() {
        return accepted_term_policy_data;
    }

    public void setAccepted_term_policy_data(String accepted_term_policy_data) {
        this.accepted_term_policy_data = accepted_term_policy_data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public String getCustom_code() {
        return custom_code;
    }

    public void setCustom_code(String custom_code) {
        this.custom_code = custom_code;
    }

    public String getOtp_secret() {
        return otp_secret;
    }

    public void setOtp_secret(String otp_secret) {
        this.otp_secret = otp_secret;
    }
}
