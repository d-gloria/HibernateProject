import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 255, nullable = false)
    private String title;

    @Column(nullable = false)
    private int yearOfRelease;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;

    @ManyToMany(mappedBy = "movies")
    private Set<Actor> actors;

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }
}