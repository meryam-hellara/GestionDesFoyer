package tn.esprim.gestiondesfoyer.entities;

import jakarta.persistence.*;
import lombok.*; // pour getter et setter
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
// on a aussi requert constructeur ou on peut specifier constructeur pour des attributs mou3aynin
@NoArgsConstructor
@AllArgsConstructor
public class Bloc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

// cascade= CascadeType.ALL : quand on supprime bloc se supprime chambres
    @OneToMany(mappedBy = "bloc", cascade= CascadeType.ALL) // car il est indique que bloc fils
    private List<Chambre> chambres; // private set<Chambre> chambres;


}
