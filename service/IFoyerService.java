package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer>     retrieveAllFoyers();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer foyer);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer (Foyer foyer);
}
