package Esercizi.Injection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService service;

    @Autowired
    public MyController(MyService service) {
        this.service = service;
    }

    @PostConstruct
    @GetMapping("/")
    void welcome(){
        System.out.println("MyController.welcome");
        System.out.println("Costruttori eseguiti");
    }

    @GetMapping("/getName")
    String getName(){
        return service.getName();
    }
}
