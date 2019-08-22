import java.util.Scanner;

public class Arrays_exercise {
    public static void main(String[] args) {
        // 1 uzd 63 skaidre
        int[] a = {2, 4, 7, 8, 9};
        for (int r : a) {
            System.out.print(r + " ");
        }
        System.out.println();
        //kitas budas 1 uzd
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //2
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk masyvo dydį: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = i+7;
            System.out.printf("b[%d] = %d\n", i, b[i]);
        }
        //3
        System.out.println("Įvesk masyvo dydį: ");
        int m = sc.nextInt();
        int[] c = new int[m];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
            System.out.printf("c[%d] = %d\n", i, c[i]);
        }
        //4 uzd
        int[] d = {10, 20, 30, 40};
        int sum = 0;
        for (int r : d) {
            sum += r;
        }
        System.out.println("Suma yra: " + sum);
        //5 uzd
        int[][] t = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                t[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d*%d=%d\t", i+1, j+1, (i+1)*(j+1));
            }
            System.out.println();
        }

    }
}


