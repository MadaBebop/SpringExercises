package Esercizi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/controller/{name}")
    public String getName(@PathVariable String name) {
        return name;
    }

    @PostMapping(value = "/controller/{name}")
    public String postName(@PathVariable String name) { //eseguo direttamente qui la logica (not recommended)
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
}