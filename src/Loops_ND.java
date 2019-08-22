import java.util.Scanner;

public class Loops_ND {
    public static void main(String[] args) {
        //ND 55 ps 2 uzduotis
        {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Parašyk ką nors: ");
                String word = sc.next();
                if (word.equalsIgnoreCase("tęski")) {
                    continue;
                }
                System.out.println(word);
            }

        }

    }
}
