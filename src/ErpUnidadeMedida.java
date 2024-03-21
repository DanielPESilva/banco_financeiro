import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class ErpUnidadeMedida {
    private int id;
    private String name;
    private String description;
    private char active;
    private LocalDateTime data_lancamento;

    public ErpUnidadeMedida(int id, String name, String description, char active, LocalDateTime data_lancamento) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.data_lancamento = data_lancamento;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
