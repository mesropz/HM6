package No1_Uppercase;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {



    public List<String> upperCase (List < String > list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

}