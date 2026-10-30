package tn.esprim.gestiondesfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Foyer;
import tn.esprim.gestiondesfoyer.repositories.FoyerRepository;

import java.util.List;

@Service
public class FoyerServiceImpl implements IFoyerService {
    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long foyerId) {
        return foyerRepository.findById(foyerId).get();
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void removeFoyer(Long foyerId) {
        foyerRepository.deleteById(foyerId);
    }



    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
}
