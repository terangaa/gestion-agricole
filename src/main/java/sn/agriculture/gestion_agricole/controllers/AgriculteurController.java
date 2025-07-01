package sn.agriculture.gestion_agricole.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.agriculture.gestion_agricole.models.Agriculteur;
import sn.agriculture.gestion_agricole.models.Parcelle;
import sn.agriculture.gestion_agricole.repositories.AgriculteurRepository;

import java.util.List;

@RestController
@RequestMapping("/api/agriculteurs")
public class AgriculteurController {
    @Autowired
    private AgriculteurRepository agriculteurRepository;

    @GetMapping
    public List<Agriculteur> getAll() {
        return agriculteurRepository.findAll();
    }

    @PostMapping("/agriculteurs")
    public Agriculteur ajouterAgriculteur(@RequestBody Agriculteur agriculteur) {
        // Réaffecter l’agriculteur à chaque parcelle
        for (Parcelle p : agriculteur.getParcelles()) {
            p.setAgriculteur(agriculteur);
        }
        return agriculteurRepository.save(agriculteur);
    }
}
