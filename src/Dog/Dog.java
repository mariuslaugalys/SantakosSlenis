package Dog;

public class Dog {
    public String name;
    public int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        if (age < 5) {
            System.out.println(name + ": Keu keu");
        } else if (age >= 6 && age < 15) {
            System.out.println(name + ": eik eik");
        } else {
            System.out.println(name + ": ojoj ojoj");
        }

    }
}
