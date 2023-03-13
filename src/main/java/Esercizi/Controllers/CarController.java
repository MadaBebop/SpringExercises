package Esercizi.Controllers;

import Esercizi.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RequestMapping("/car")
@RestController
public class CarController {

        @PostMapping("/print")
        public ResponseEntity<String> printCar(@RequestBody @NotBlank CarDTO car){
            System.out.println( "id: " + car.id() + "\tname: " + car.modelName() + "\tprice: " + car.price() );
            //controllo null?
            if(car.modelName() == null || car.id() == null)
                return new ResponseEntity<>("Invalid car arguments", HttpStatus.BAD_REQUEST);

            return new ResponseEntity<>("Created successfully!", HttpStatus.OK);
        }

        @GetMapping("/create")
        public CarDTO createCar(){
            return new CarDTO("abf21", "Mazda", 4500.00);
        }
}
