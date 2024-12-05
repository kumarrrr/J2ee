package tutorial;

public class StringReverse01 {
    public static void main(String[] args) {
        // reverse the string without using streams
        String name = "Ravi";
        char[] chars = name.toCharArray();
        for(int i =chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }
    }
}
