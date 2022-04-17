import java.util.Arrays;
import java.util.Comparator;

public class Room implements Comparable<Room>{
    private double width;
    private  double length;
    private int floor;

    public Room() {
       this.width = 10;
        this.length = 12.5;
      this.floor = 1;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width >0) {
        this.width = width;}
        else return;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else return;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Room(double a, double b, int floor) {
     if(a > b) {this.length = a; this.width = b;};
     if(a < b) {this.length = b; this.width = a;};
     this.floor = floor;

    }

    @Override
    public String toString() {
        return "Room{" + length + " x " + width +
                ", floor=" + floor +
                '}';
    }
    public int compareTo(Room another) {
        return Comparator.comparing(Room::getFloor).thenComparing(Room::getLength).thenComparing(Room::getWidth)
                .compare(this, another);
        };



    public static void main(String[] args) {
        Room[] list = {
                new Room(7, 5, 1),
                new Room(7, 5, 2),
                new Room(8, 4, 1),
                new Room(8, 4, 2),
                new Room(9, 2, 3),
                new Room(9, 2, 1),

        };
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }

}

