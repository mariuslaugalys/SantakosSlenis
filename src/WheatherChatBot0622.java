import java.util.Scanner;

public class WheatherChatBot0622 {
    public static void  main (String[] args) {
            System.out.println("Koks oras?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        String[] hotWords = {"karsta", "prakait", "tvanku"};
        String[] rainyWords = {"rain", "raining", "rain", "pouring"};

//1 var - kurti zodziu masyva
        boolean isHot = false;
        for (String word : hotWords) {
            isHot = isHot || answer.contains(word);
        }
        //2 var - su regex
        boolean isCold = answer.matches(".*(cold|freezing|frozen).*");

        boolean isRainy = false;
        for (String w1 : answer.split(" ")) {
            for(String w2 : rainyWords) {
                isRainy = isRainy || (w1.equalsIgnoreCase(w2));
            }
        }

        if (isHot) {
            System.out.println("Taip, labai karsta");
        }
        else if (isCold) {
            System.out.println("Taip, salta");
        }
        else if (isRainy) {
            System.out.println("Labai lyja");
        }
        else {
            System.out.println("Sorry nesupratau");
        }
    }
}
