package tn.esprim.gestiondesfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprim.gestiondesfoyer.entities.Bloc;
import tn.esprim.gestiondesfoyer.service.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocRestController {
    @Autowired
    private IBlocService blocService;

    // https://localhost:8085/tpFoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        Bloc bloc = blocService.retrieveBloc(blocId);
        return bloc;
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }

    @DeleteMapping("/delete-bloc/{bloc-id}")
    public void deleteBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }

    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        return blocService.modifyBloc(b);
    }
}