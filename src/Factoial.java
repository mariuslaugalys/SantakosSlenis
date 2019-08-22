public class Factoial {
    public static long factorial(byte n){
        long sum = 1;

        for(int i = 1; i<=n; i++){
            sum *=i;
        }
        return sum;
    }
    public static void main(String[] args){
        byte a1 = 5;
        byte a2 = 6;
        byte a3 = 7;
        int a4 = a3;
        System.out.println(factorial(a1));
        System.out.println(factorial(a2));
        System.out.println(factorial(a3));
        System.out.println(factorial((byte)a4));

    }
}
