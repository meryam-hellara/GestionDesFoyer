package tn.esprim.gestiondesfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Foyer  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    // il est le fils donc il a une mappedBy obligatoirement
    @OneToOne(mappedBy = "foyer") // car il est indique que foyer fils
    private Universite universite;

    @OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL) // car il est indique que foyer fils
    private List<Bloc> blocs;



}
