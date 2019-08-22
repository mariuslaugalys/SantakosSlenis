public class Arrays {
    public static void main (String [] args) {
        int [] a = new int[5];
        for (int i=0; i<5; i++) {
            a[i] = i;
        }
        // budai kaip galima uzrasyti masyvus, i masyvus galime deti String; gali buti masyvas masyve
        int [] b = new int[]{1, 2, 3, 4, 5};
        int[] c = {1, 2, 3, 4, 5};
        String [] d = {"apple", "cherry", "pear"};
        int [] [] e = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       System.out.println(e[0][0]);

       System.out.println("Hello");
    }
}
