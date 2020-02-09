package No5_Sum;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList= Arrays.asList(5,10,20,52,41);


        System.out.println(myList.stream()
                .mapToInt(Integer::intValue)
                .sum());


    }
}
