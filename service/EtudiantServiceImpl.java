package tn.esprim.gestiondesfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Etudiant;
import tn.esprim.gestiondesfoyer.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImpl implements IEtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
            return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return etudiantRepository.findById(etudiantId).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void removeEtudiant(Long etudiantId) {
        etudiantRepository.deleteById(etudiantId);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
