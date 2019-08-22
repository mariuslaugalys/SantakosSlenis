package room;

public class Room {
    public int width;
    public int height;
    public int lenght;

    public Room(int width, int height, int lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public int getVolume() {
        return width * height * lenght;
    }

    public int getSurface() {
        return width * lenght;
    }
}