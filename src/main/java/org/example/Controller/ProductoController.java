package org.example.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
    @GetMapping("/")
    //findAll es un metoodo publico y devuelve un string, que representa le nombre de la vista
    //a la que le llegara la info
    //el model permite pasar datos a la vista
    public String findAll(Model model) {

    }
}
