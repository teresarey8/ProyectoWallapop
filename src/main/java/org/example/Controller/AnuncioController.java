package org.example.Controller;

import ch.qos.logback.core.model.Model;
import org.example.Service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.example.Entity.Anuncio;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class AnuncioController {

    private final AnuncioService anuncioService;

    @Autowired
    public AnuncioController(AnuncioService anuncioService) {
        this.anuncioService = anuncioService;
    }

    @GetMapping("/")
    //findAll es un metoodo publico y devuelve un string, que representa le nombre de la vista
    //a la que le llegara la info
    //el model permite pasar datos a la vista
    public String findAll(Model model) {
        model.addAttribute("anuncios")
    }
}
