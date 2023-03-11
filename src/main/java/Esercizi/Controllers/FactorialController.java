package Esercizi.Controllers;

import Esercizi.Services.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @Autowired //non safe?
    private FactorialService fact;

    @GetMapping("/{n}")
    public int getFactorial(@PathVariable int n) {
        return fact.factorial(n);
    }

}
