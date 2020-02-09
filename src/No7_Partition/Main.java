package No7_Partition;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> human=new HashMap<String, Integer>();
        Map<String, Integer> kids=new HashMap<String, Integer>();
        Map<String, Integer> adults=new HashMap<String, Integer>();


        human.put("human1",4);
        human.put("human2",1);
        human.put("human3",19);
        human.put("human4",12);
        human.put("human5",67);
        human.put("human6",25);
        human.put("human7",8);


        human.entrySet()
                .stream()
                .filter( e -> e.getValue()>18)
                .forEach(entry -> adults.put(entry.getKey(),entry.getValue()));

        human.entrySet()
                .stream()
                .filter( e -> e.getValue()<18)
                .forEach(entry -> kids.put(entry.getKey(),entry.getValue()));

        System.out.println("Adults: "+adults);
        System.out.println("Kids: "+kids);




    /*    kids.entrySet()
                .stream()
                .filter( e -> e.getValue()>=18)
                .forEach(entry -> adults.put(entry.getKey(), entry.getValue()));
*/
        //   System.out.println("Kids: "+kids);
        //System.out.println("Adults: "+adults);

    }


}