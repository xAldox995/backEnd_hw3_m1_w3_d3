package aldovalzani.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partecipazione")
    private int idPartecipazione;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    private Stato stato;

    public Partecipazione() {
    }
}
