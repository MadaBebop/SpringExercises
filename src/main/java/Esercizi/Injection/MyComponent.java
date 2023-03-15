//Non ho propriamente eseguito l'ultima task

package Esercizi.Injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String MyComponentName;

    public MyComponent(@Value("Lollo not cool") String MyComponentName) {
        this.MyComponentName = MyComponentName;
    }

    public String getMyComponentName(){
        return MyComponentName;
    }
}
