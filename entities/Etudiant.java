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
public class Etudiant  implements Serializable {
    // implements Serializable: pour partager objet dans un reseau on transformant objet a un autre type comme json ..
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Reservation> reservations;
}

