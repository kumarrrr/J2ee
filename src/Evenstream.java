import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Evenstream {
    public static void main(String [] args){
        //List of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenNumber = numbers.stream()
                                          .filter(num -> num % 2 ==0)
                                          .collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
