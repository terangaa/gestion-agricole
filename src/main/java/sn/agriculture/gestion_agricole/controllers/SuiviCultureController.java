package sn.agriculture.gestion_agricole.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.agriculture.gestion_agricole.models.Agriculteur;
import sn.agriculture.gestion_agricole.models.SuiviCulture;
import sn.agriculture.gestion_agricole.repositories.AgriculteurRepository;
import sn.agriculture.gestion_agricole.repositories.SuiviCultureRepository;

import java.util.List;

@RestController
@RequestMapping("/api/suivicultures")
public class SuiviCultureController {
    @Autowired
    private SuiviCultureRepository suiviCultureRepository;

    @GetMapping
    public List<SuiviCulture> getAll() {
        return suiviCultureRepository.findAll();
    }

    @PostMapping
    public SuiviCulture create(@RequestBody SuiviCulture e) {
        return suiviCultureRepository.save(e);
    }
}
