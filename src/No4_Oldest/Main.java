package No4_Oldest;
import static java.util.Comparator.comparingInt;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(5,10,20,52,41);


        System.out.println(myList.stream()
                .max(Integer::compare)
                .get());


    }
}