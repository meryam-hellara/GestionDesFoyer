package tn.esprim.gestiondesfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiondesfoyer.entities.Universite;


@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
