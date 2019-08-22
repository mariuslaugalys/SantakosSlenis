package objects_example;
// jei PUBLIC lengvai prieinamas, PRIVATE - neprieinamas
public class Point {
    public int x;
    public int y;

    private boolean isCool;
//konstruktoriaus vardas turi sutapti su klases vardu
    public Point (int x, int y) {
        this.x=x;
        this.y=y;

        isCool = true;
    }
    public void printPoint () {
        System.out.printf("x: %d y: %d", x, y);
    }
}
