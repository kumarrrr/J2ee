import java.util.*;
public class Output {
    public String reverseString(String in){
        if(in==null){
            throw new IllegalArgumentException("Null is not a valid input");
        }
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();
        for(int i = chars.length-1; i>=0; i--){
            out.append(chars[i]);
        }
        return out.toString();
    }
    public boolean vowelsCheck(String in){
       return in.matches(".*[aeiou].*");
    };
    public static void main(String[] args){
     Output x = new Output();
        String in = "Hello";

        System.out.println(x.vowelsCheck(in));
        System.out.println(x.reverseString(in));
    }


}
