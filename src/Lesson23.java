import java.util.Locale;

public class Lesson23 {
    public static void main(String[] args) {
        String string1="Hello";
        String string2=" My";
        String string3=" friend";
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        sb.append(" friend");
        System.out.println(sb.toString());

        System.out.printf("Hello %d again, %s \n",10, "NICE" );
        System.out.printf("Hello %10d ",542);

    }
}
