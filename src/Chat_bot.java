import java.util.Scanner;

public class Chat_bot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Labas. Aš noriu atspėti koks dabar metų laikas, todėl paprašysiu pateikti šiek tiek info. Tačiau pirmiausia noriu sužinoti tavo vardą ");
        String firstName = sc.nextLine();
        System.out.println("Ar 20 val lauke vis dar šviesu?");
        String arsviesu = sc.nextLine();
        System.out.println("Ar šį mėn. temperatūra buvo pakilusi iki 27 laipsnių?");
        String celsijus = sc.nextLine();
        System.out.println("Pasakyk, kelintą val ryte švinta?");
        int kadasvinta = sc.nextInt();

        if (kadasvinta <= 6 && arsviesu.toLowerCase().contains("taip") && celsijus.toLowerCase().contains("taip")) {
            System.out.println("vasara");
        }
        else {
            System.out.println("ne vasara");
        }

    }
}

// kaip iterpti kreipini varda; kaip i IF sudeti visas salygas