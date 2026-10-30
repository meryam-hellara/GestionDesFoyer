package tn.esprim.gestiondesfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprim.gestiondesfoyer.entities.Chambre;
import tn.esprim.gestiondesfoyer.service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreRestController {
    @Autowired
    private IChambreService chambreService;

    //https://localhost:8085/tpFoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all_chambres")
    public List<Chambre>getChambres(){
        List<Chambre> listChambres=chambreService.retrieveAllChambres();
        return listChambres;
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id")Long chld){
        Chambre chambre= chambreService.retrieveChambres(chld);
        return chambre;
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
     @DeleteMapping("/delete-chambre/{chambre-id}")
    public void deleteChambre(@PathVariable("chambre-id")Long chld){
        chambreService.removeChambre(chld);
    }

    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre c){
        return chambreService.modifyChambre(c); }

}
