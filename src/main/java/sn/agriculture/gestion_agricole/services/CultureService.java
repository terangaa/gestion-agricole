package sn.agriculture.gestion_agricole.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.agriculture.gestion_agricole.models.Culture;
import sn.agriculture.gestion_agricole.repositories.CultureRepository;

import java.util.List;

@Service
public class CultureService {

    @Autowired
    private CultureRepository cultureRepository;

    public List<Culture> findAll() {
        return cultureRepository.findAll();
    }

    public Culture save(Culture culture) {
        return cultureRepository.save(culture);
    }
}
