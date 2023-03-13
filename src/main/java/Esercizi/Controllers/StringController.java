package Esercizi.Controllers;

import Esercizi.Services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@RequestMapping("/String")
@RestController
public class StringController {

    @Autowired
    StringService stringService;

    @PostMapping()
    public String getString(@NotBlank(message = "Value must be placed") @RequestParam() String firstValue,
                            @RequestParam(required = false) Optional<String> secondValue) {

        return stringService.concatStrings(firstValue, secondValue);
    }
}
