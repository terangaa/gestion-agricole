package sn.agriculture.gestion_agricole.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.agriculture.gestion_agricole.models.Parcelle;
import sn.agriculture.gestion_agricole.repositories.ParcelleRepository;

import java.util.List;

@RestController
@RequestMapping("/api/parcelles")
public class ParcelleController {
    @Autowired
    private ParcelleRepository parcelleRepository;

    @GetMapping
    public List<Parcelle> getAll() {
        return parcelleRepository.findAll();
    }

    @PostMapping
    public Parcelle create(@RequestBody Parcelle e) {
        return parcelleRepository.save(e);
    }
}
