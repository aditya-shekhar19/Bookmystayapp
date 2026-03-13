import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    // Get availability
    public int getAvailability(String type) {
        if (inventory.containsKey(type)) {
            return inventory.get(type);
        }
        return 0;
    }

    // Update availability
    public void updateAvailability(String type, int change) {
        if (inventory.containsKey(type)) {
            int current = inventory.get(type);
            inventory.put(type, current + change);
        }
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("Current Room Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


public class Bookmystayapp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println("\nAvailable Single rooms: "
                + inventory.getAvailability("Single"));

        inventory.updateAvailability("Single", -1);

        inventory.updateAvailability("Suite", 1);

        System.out.println("\nAfter Updates:");
        inventory.displayInventory();
    }
}