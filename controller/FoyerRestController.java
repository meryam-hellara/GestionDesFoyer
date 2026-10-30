package tn.esprim.gestiondesfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprim.gestiondesfoyer.entities.Foyer;
import tn.esprim.gestiondesfoyer.service.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerRestController {
    @Autowired
    private IFoyerService foyerService;

    // https://localhost:8085/tpFoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        Foyer foyer = foyerService.retrieveFoyer(foyerId);
        return foyer;
    }

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }

    @DeleteMapping("/delete-foyer/{foyer-id}")
    public void deleteFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }

    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerService.modifyFoyer(f);
    }
}