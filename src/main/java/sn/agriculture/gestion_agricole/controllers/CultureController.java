package sn.agriculture.gestion_agricole.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.agriculture.gestion_agricole.models.Culture;
import sn.agriculture.gestion_agricole.services.CultureService;

import java.util.List;


@RestController
@RequestMapping("/api/cultures")
public class CultureController {
    @Autowired
    private CultureService cultureService;;

    @GetMapping
    public List<Culture> getAll() {
        return cultureService.findAll();
    }

    @PostMapping
    public Culture create(@RequestBody Culture e) {
        return cultureService.save(e);
    }
}
