
public class Bookmystayapp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println(" Welcome to BookMyStay System ");
        System.out.println(" Application Version : 2.1 ");
        System.out.println("==================================");

        // Creating room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleAvailability = 10;
        int doubleAvailability = 5;
        int suiteAvailability = 2;

        // Display room details
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + singleAvailability);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + doubleAvailability);
        System.out.println();

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + suiteAvailability);
    }
}



abstract class Room {

    private String roomType;
    private int beds;
    private int size;
    private double price;

    public Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sq ft");
        System.out.println("Price     : $" + price);
    }
}



class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 80.0);
    }
}



class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 120.0);
    }
}



class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 600, 250.0);
    }
}