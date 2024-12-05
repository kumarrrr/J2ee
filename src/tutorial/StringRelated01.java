package tutorial;

public class StringRelated01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb.getClass().getName());
        System.out.println(sb);
    }
}
