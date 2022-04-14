import java.util.ArrayList;

public class ClassRoom extends Room{
    private int numStudents;

    public ClassRoom(double a, double b, int floor, int numStudents) {
        super(a, b, floor);
        this.numStudents = numStudents;
    }

    public ClassRoom() {
        super();
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return "Room{" + getLength() + " x " + getWidth() +
                ", floor=" + getFloor() + " capacity = " + numStudents + " students" +
                '}';
    }

    public ClassRoom(double a, double b, int floor) {
        super(a, b, floor);
    }

    public static ArrayList<ClassRoom> classrooms(Room[] p) {
           ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();

                for(int i = 0; i < p.length; i++) {
                   p[i] = new ClassRoom();
                   classRooms.add(i, (ClassRoom) p[i]);

                }

        System.out.println(classRooms);
    return classRooms;
    }


public static void main (String[] args) {
    Room[] list2 = {
            new Room(7, 5, 1),
            new Room(7, 5, 2),
            new Room(8, 4, 1),
            new Room(8, 4, 2),
            new Room(9, 2, 3),
            new Room(9, 2, 1),

    };
    classrooms(list2);
}}