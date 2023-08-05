package enity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;
}
