package No9_Names;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> human=new HashMap<String, Integer>();
        List<String> newString = new ArrayList<String>();


        human.put("human1",4);
        human.put("human2",1);
        human.put("human3",19);
        human.put("human4",12);
        human.put("human5",67);
        human.put("human6",25);
        human.put("human7",8);

        List<String> list = human.keySet()
                //.getvalues()
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);
}}
