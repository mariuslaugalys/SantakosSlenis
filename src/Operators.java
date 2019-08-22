public class Operators {
    public static void main(String[] args) {

        {
            int hour = 17;
            boolean isBright = true;
            boolean isHot = true;

            boolean t1 = hour >= 18 && isBright;
            boolean t2 = isBright && isHot;

            System.out.printf("Is it summer? %b\n", t1 && t2);

        }
        {
            int x = 4;
            System.out.printf("%d\n", x++);
            System.out.printf("%d\n", --x);
            System.out.printf("%d\n", x % 3);
            System.out.printf("%d\n", 11 % 2);
            System.out.printf("%d\n", 7 % x++);
            System.out.printf("%b\n", x == 4);
            System.out.printf("%b\n", x != 4);
            x = 10;
            int y = 5;
            System.out.printf("%b\n", x==10 && y<=5);
            System.out.printf("%b\n", x<=y && y>5);
            System.out.printf("%b\n", "abc" instanceof String);
        }
    }
}
