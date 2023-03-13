package Esercizi.Controllers;

import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header")
public class HeaderController {

    @Autowired
    ServletRequest sr;

    @GetMapping("/info")
    public String getData() {
        return "Local Name: " +sr.getLocalName()+ "\tLocal address: " + sr.getLocalAddr() +"\tLocal port: "+  sr.getLocalPort();
    }
}
