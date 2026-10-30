package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Reservation;

import java.util.List;

public interface IResrvationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String idReservation);
    public Reservation addReservation(Reservation reservation);
    public void removeReservation(String idReservation);
    public Reservation modifyReservation (Reservation reservation);
}
