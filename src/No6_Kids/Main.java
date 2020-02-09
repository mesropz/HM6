package No6_Kids;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> kids=new HashMap<String, Integer>();

        kids.put("kid1",4);
        kids.put("kid2",1);
        kids.put("kid3",19);
        kids.put("kid4",12);
        kids.put("kid5",9);

              kids.entrySet()
                      .stream()
                      .filter( e -> e.getValue()<18)
                     .forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));

      //  System.out.println(kids);
    }
}
