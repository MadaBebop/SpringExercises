//Classe che restituisce un fattoriale n : n -> !n
package Esercizi.Services;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

}
