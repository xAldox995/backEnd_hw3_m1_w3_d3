package aldovalzani.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private long idEvento;
    private String nome;
    private String citta;

    public Location() {
    }
}
