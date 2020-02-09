package No1_Uppercase;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UpperCase myobj=new UpperCase();

        List<String> mycollection = Arrays.asList("Hello", "java", "book", "yerevan", "barev");

        System.out.println(myobj.upperCase(mycollection));

    }
}
