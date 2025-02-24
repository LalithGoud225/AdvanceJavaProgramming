import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product> {
    private List<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    //logic to add items
    public void addItem(T item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    //logic to remove the items from the list
    public void removeItem(T item) {
        if(items.remove(item)) {
            System.out.println("Removed: " + item);
        } else {
            System.out.println("Not removed: " + item + "Not Found");
        }
    }

    //display all the listed items in the inventory
    public void displayItems(){
        System.out.println("Inventory Items:");
        if(items.isEmpty()) {
            System.out.println("Empty Inventory");
        } else {
            for(T item : items) {
                System.out.println(item);
            }
        }

    }

}