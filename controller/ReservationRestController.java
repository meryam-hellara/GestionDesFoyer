package tn.esprim.gestiondesfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprim.gestiondesfoyer.entities.Reservation;
import tn.esprim.gestiondesfoyer.service.IResrvationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationRestController {
    @Autowired
    private IResrvationService resrvationService;

    // https://localhost:8085/tpFoyer/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = resrvationService.retrieveAllReservations();
        return listReservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String reservationId) {
        // Remarque : Si l'ID de votre réservation est de type String (ex: "2023/2024-1234"),
        // gardez 'String'. S'il est de type Long, remplacez 'String' par 'Long'.
        Reservation reservation = resrvationService.retrieveReservation(reservationId);
        return reservation;
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = resrvationService.addReservation(r);
        return reservation;
    }

    @DeleteMapping("/delete-reservation/{reservation-id}")
    public void deleteReservation(@PathVariable("reservation-id") String reservationId) {
        resrvationService.removeReservation(reservationId);
    }

    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return resrvationService.modifyReservation(r);
    }
}