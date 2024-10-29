import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 255, nullable = false)
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}