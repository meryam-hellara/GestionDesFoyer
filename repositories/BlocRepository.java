package tn.esprim.gestiondesfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiondesfoyer.entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
