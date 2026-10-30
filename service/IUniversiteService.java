package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite universite);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite (Universite universite);
}
