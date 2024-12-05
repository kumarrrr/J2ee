package tutorial;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Homosapiens";
        char[] chars = name.toCharArray();
        System.out.println(chars[0]);
        for(int i = chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
        String animals ="Dogs";
        char[] animalsCharArray=animals.toCharArray();
        for(int y =animalsCharArray.length-1; y>=0; y--){
            System.out.println(animalsCharArray[y]);
        }
    }

}

