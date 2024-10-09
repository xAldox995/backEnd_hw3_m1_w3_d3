package aldovalzani.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@Entity
@Table(name = "persone")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private long idPersona;
    private String nome;
    private String cognome;
    private String email;
    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;
    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    public Persona() {
    }

    public Persona(String cognome, String email, String nome, Sesso sesso) {
        this.cognome = cognome;
        this.dataDiNascita = generaDataDiNascitaCasuale();
        this.email = email;
        this.nome = nome;
        this.sesso = sesso;
    }

    private LocalDate generaDataDiNascitaCasuale() {
        int minYear = LocalDate.now().minusYears(60).getYear();
        int maxYear = LocalDate.now().minusYears(18).getYear();
        int randomYear = ThreadLocalRandom.current().nextInt(minYear, maxYear + 1);
        int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);
        int randomDay = ThreadLocalRandom.current().nextInt(1, LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth() + 1);
        return LocalDate.of(randomYear, randomMonth, randomDay);
    }


}
