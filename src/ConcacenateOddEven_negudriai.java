import java.util.Arrays;

public class ConcacenateOddEven_negudriai {
    public static void  main (String[] args) {
        int [] [] OddEven = {
                {9, 8, 7, 6, 5, 4},
                {1, 2}
        };

        System.out.print(OddEven[0][4] + "-");
        System.out.print(OddEven[0][5] + "-");
        System.out.print(OddEven[0][2] + "-");
        System.out.print(OddEven[0][3] + "-");
        System.out.print(OddEven[0][0] + "-");
        System.out.print(OddEven[0][1] + "\n");
        System.out.print(OddEven[1][0] + "-");
        System.out.print(OddEven[0][4] + "\n");
    }
}
