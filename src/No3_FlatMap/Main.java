package No3_FlatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<String>> myList= Arrays.asList(Arrays.asList("Hello","hi", "book", "yerevan"), Arrays.asList("barev", "one", "TWO", "Three"));
        System.out.println(myList);

            List<String> newString= myList.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(newString);

    }
}
