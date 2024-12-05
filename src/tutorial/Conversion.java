package tutorial;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Conversion {
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Grapes","Apples","Watermelon" };
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);
        // above works good for the case of object types where as for the case of primitive types such as
// int,doubles we have to move them into wrapper function & then do the operation

        int[] numbers = {1,2,3,4,5};
        List<Integer> x = IntStream.of(numbers).boxed().collect(Collectors.toList());
        for(int i =numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }
        System.out.println(x);
        System.out.println(x.getClass().getName());
        System.out.println(numbers.getClass().getName());
    }
}



