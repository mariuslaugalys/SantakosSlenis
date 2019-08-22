package room;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(4, 2, 4);
        System.out.println("Surface: " + r1.getSurface());
        System.out.println("Volume : " + r1.getVolume());
    }
}
