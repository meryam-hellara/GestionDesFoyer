package tn.esprim.gestiondesfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Reservation;
import tn.esprim.gestiondesfoyer.repositories.ChambreRepository;
import tn.esprim.gestiondesfoyer.repositories.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImpl implements IResrvationService{
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void removeReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }



    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
