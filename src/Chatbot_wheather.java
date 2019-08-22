import java.util.Scanner;

public class Chatbot_wheather {
    public static void main(String[] args) {

        System.out.println("Koks šiandien oras?");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Nurodyk savo varda: ");
        String firstName = sc.next();
        System.out.println("Nurodyk savo pavarde: ");
        String lastName = sc.next();
        System.out.printf ("Kiek tau metuku?");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.printf ("Amzius %d\n", age);

            System.out.printf("Labas, %s\n", firstName);
            System.out.printf("Pone %s, einam kartu\n", lastName);
        }
        else {
            System.out.println("niekur neisi");
        }


    }
}
