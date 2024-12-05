package tutorial;

import java.util.Arrays;
import java.util.List;

public class levelStreams01 {
    //define a string
    //convert it into a list
    //filter out the duplicates
    //print the result
    public static void main(String[] args) {
        String[] names = {"Ravi","Mohan","Raj","Dileep","Mohan"};
        List<String> defined =Arrays.asList(names);
        List<String> nonDuplicates = defined.stream().distinct().toList();
        System.out.println(nonDuplicates.getClass().getName());
    }
}
