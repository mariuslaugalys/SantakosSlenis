import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 5) {
            System.out.println("Marius");
            a++;
        }
// zodis atvirksciai 5 uzduotis 45 skaidre
        String text = "Katinas";
        int b = text.length();
        while (b > 0) {
            System.out.print(text.charAt(b - 1));
            b--;
            System.out.println();
        }
        for (int x = 1; x <= 5; x++) {
            System.out.println("Petras");
        }
        for (int x = 1; x <= 5; x++) {
            System.out.println("Petras: " + x);
        }
        for (int x = 5; x >= 1; x--) {
            System.out.println("Petras: " + x);
        }
        int sum = 0;
        for (int i = 30; i >= 10; i--) {
            sum += i;
            System.out.println(sum);
        }
        //5 uzduotis is preworko 67 psl
        //ENHANCED FOR LOOP (for f in fruits, 1 f vienas vaisius)
        String[] fruits = {"apple", "orange", "peer", "banans"};
        for (String f : fruits) {
            System.out.println(f);
        }
        //ND: 55 psl 1 uzduotis
        {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Parašyk ką nors: ");
                String word = sc.next();
                if (word.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.println(word);
            }

        }
    }
}
