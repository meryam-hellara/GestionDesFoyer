package tn.esprim.gestiondesfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprim.gestiondesfoyer.entities.Etudiant;
import tn.esprim.gestiondesfoyer.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {
    @Autowired
    private IEtudiantService etudiantService;

    // https://localhost:8085/tpFoyer/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(etudiantId);
        return etudiant;
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/delete-etudiant/{etudiant-id}")
    public void deleteEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.modifyEtudiant(e);
    }
}