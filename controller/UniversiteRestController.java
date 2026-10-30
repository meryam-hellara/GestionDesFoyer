package tn.esprim.gestiondesfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprim.gestiondesfoyer.entities.Universite;
import tn.esprim.gestiondesfoyer.service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteRestController {
    @Autowired
    private IUniversiteService universiteService;

    // https://localhost:8085/tpFoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long universiteId) {
        Universite universite = universiteService.retrieveUniversite(universiteId);
        return universite;
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    @DeleteMapping("/delete-universite/{universite-id}")
    public void deleteUniversite(@PathVariable("universite-id") Long universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        return universiteService.modifyUniversite(u);
    }
}