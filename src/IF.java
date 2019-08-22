import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk skaičių iš intervalo 0-5: ");
        int Number = sc.nextInt();
        if (Number == 0) {
            System.out.println("*");
        } else if (Number == 1) {
            System.out.println("@");
        } else if (Number == 2) {
            System.out.println("$");
        } else {
            System.out.println("Ne tokį numerį vedi");
        }
        // vietoj IF naudoti switch, biški greičiau
        switch (Number) {
            case 0:
                System.out.println("@");
                break;
            case 1:
                System.out.println("$");
                break;
            case 2:
                System.out.println("$");
                break;
            default:
                System.out.println("Ne tokį numerį vedi");
                break;
        }
        switch (Number) {
            case 0:
                System.out.println("@");
                break;
            case 1:
                System.out.println("$");
                break;
            case 2:
                System.out.println("$");
                break;
            default:
                System.out.println("Ne tokį numerį vedi");

        }
    }
}
