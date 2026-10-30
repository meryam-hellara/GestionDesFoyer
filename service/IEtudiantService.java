package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant etudiant);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant (Etudiant etudiant);
}
