package tn.esprim.gestiondesfoyer.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reservation implements Serializable{
    @Id
    private String idReservation; // De type String selon le diagramme

    private String anneeUniversitaire;
    private boolean estValide;

    @ManyToMany ( cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}
