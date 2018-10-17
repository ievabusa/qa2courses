import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Example {

    @Test
    public void example() {

        List<String> klase = new ArrayList<String>();
        klase.add ("Laura");
        klase.add ("Dmitrijs");
        klase.add ("Sergejs");
        klase.add ("Ieva");
        System.out.println("Size of list: " + klase.size());
        System.out.println("Is list empty: " + klase.isEmpty());
        System.out.println("3rd one is: " + klase.get (2));
    }


}

