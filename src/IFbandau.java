import java.util.Scanner;

public class IFbandau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk vaisių: ");
        String text = sc.next();
        if (text.equals("obuolys")) {
            System.out.println("*");
        } else if (text.equals("kriaušė")) {
            System.out.println("@");
        } else if (text.equals("persikas")) {
            System.out.println("$");
        } else {
            System.out.println("Krc nepažįsti vaisių");
        }
        switch (text) {
            case "obuolys":
                System.out.println("@");
                break;
            case "kriaušė":
                System.out.println("$");
                break;
            case "persikas":
                System.out.println("$");
                break;
            default:
                System.out.println("Krc nepažįsti vaisių");
        }
    }
}