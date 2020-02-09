package No2_LessThanFour;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        List<String> mycollection = Arrays.asList("Hello", "hi", "book", "yerevan", "barev", "one", "TWO", "Three");

        mycollection.stream()
            .filter(x->x.length()<=4)
            .collect(Collectors.toList())
            .forEach(System.out::println) ;

     //   System.out.println(mycollection);
        }

    }


