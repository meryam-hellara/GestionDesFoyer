package tn.esprim.gestiondesfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiondesfoyer.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
