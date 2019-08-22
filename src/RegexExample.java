import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public  static void main (String [] args) {
        String text = "Hello World";
        System.out.println(text.replaceAll("(H|h)ello", "Ikiukas"));
        System.out.println(text.replaceAll("[aeiou]", "?"));
        System.out.println(text.matches("(Hello|(Good (evening|morning)))+\\s+\\w+!?"));

        Scanner sc = new Scanner(System.in);
            System.out.println("Kokis tavo vardas: ");
            String name = sc.next("[A-Z]\\w+");
            System.out.println("Vardas: " + name);

            String address = "Anthony B. Carpenter, mob. 618-439-3833, AnthonyBCarpenter@rhyta.com, 821 Butternut\n" +
                    "Lane Benton, IL 62812";
        Pattern numberPattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        Matcher m = numberPattern.matcher(address);
        m.find();
        System.out.println("Adresas toks: " + m.group());
        }
    }

