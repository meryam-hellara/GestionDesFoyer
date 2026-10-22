package tn.esprim.gestiondesfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiondesfoyer.entities.Chambre;

@Repository

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
