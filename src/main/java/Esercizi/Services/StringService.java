package Esercizi.Services;

import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class StringService {

    public String concatStrings(String first, Optional<String> second){
        if(second.isEmpty())
            return first;
        return first+second.get();
    }
}
