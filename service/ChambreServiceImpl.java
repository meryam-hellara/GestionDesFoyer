package tn.esprim.gestiondesfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Chambre;
import tn.esprim.gestiondesfoyer.repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImpl implements IChambreService {
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambres(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
