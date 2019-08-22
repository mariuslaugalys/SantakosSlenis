package objects_example;

import Dog.Dog;

public class Main {
    public static void main (String[] args) {
        Dog Reksas = new Dog("Reksas", 4);
        Dog Brisius = new Dog("Brisius", 18);
        Dog Jonas = new Dog ("Jonas", 8);

        Reksas.bark();
        Brisius.bark();
        Jonas.bark();
    }
}
