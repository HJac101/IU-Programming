import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSalat {
    public static void main(String[] args) {

        String frucht = "Ananas";

        String[] scheibchen = frucht.split("a");
        System.out.println(Arrays.toString(scheibchen));

        String gegner = "Schleimiger Riesenschneckendrache";
        String[] haeppchen = gegner.split("e");
        System.out.println(Arrays.toString(haeppchen));
        System.out.println(gegner.substring(18, 26));
        System.out.println(gegner.charAt(gegner.length()-1));

        int a = 12;
        String zahl = String.valueOf(a);
        System.out.println(zahl);
        String zahl2 = "23";
        int b = Integer.parseInt(zahl2);
        System.out.println(b);
    }
}
