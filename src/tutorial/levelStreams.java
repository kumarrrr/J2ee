package tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class levelStreams {
    public static void main(String[] args) {
        String[] names = { "Ravi","Alex","John","Mariya","John","Ravi"};
        List<String> defined = Arrays.asList(names);
        List<String> nonDuplicates =  defined.stream().distinct().toList();
        System.out.println(nonDuplicates);


    }
}
