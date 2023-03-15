package Esercizi.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent component;

    @Autowired
    public MyService(MyComponent component) {
        this.component = component;
    }

    public String getName(){
        return component.getMyComponentName();
    }


}
