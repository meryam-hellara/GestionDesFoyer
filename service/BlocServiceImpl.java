package tn.esprim.gestiondesfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Bloc;
import tn.esprim.gestiondesfoyer.repositories.BlocRepository;
import tn.esprim.gestiondesfoyer.repositories.ChambreRepository;

import java.util.List;

@Service

public class BlocServiceImpl implements IBlocService{
    @Autowired
        private BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).get();
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
