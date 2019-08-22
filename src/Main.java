public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //Printf naudojimas
     String name = "Marius";
             int age;
             age = 20;
        System.out.printf("Hello %s, nice to meet you, I guess you are %s\n", name, age) ;
        age += 5;
        System.out.printf("Hello %s, nice to meet you, I guess you are %s\n", name, age);

        {
            int a = 19;
            double b = 187.2342;
            System.out.println(a);
            System.out.println(b);
        }

        { //norint gauti po kablelio pvz 5 skt, abu kintamieji turi buti double
            double a = 6;
            double b = 11;
            System.out.printf("%.5f\n", a / b);
        }

        {// suapvalinimas iki 2 skaitmenu po kablelio, tinka tik printf
            double a = 3.2355;
            System.out.printf("%.2f\n", a);
        }



    }
}