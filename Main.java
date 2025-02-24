import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Created inventory for each class file Electronics, Groceries, Clothing
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Inventory<Groceries> groceriesInventory = new Inventory<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();

        // Created some products for electronics
        Electronics laptop = new Electronics("E001", "Laptop", 1200.00, 24);
        Electronics smartphone = new Electronics("E002", "Smartphone", 799.99, 12);

        //Created some products to Groceries
        Groceries milk = new Groceries("G001", "Milk", 2.49, LocalDate.of(2023, 12, 31));
        Groceries fruits = new Groceries("G002", "Fruits", 5.99, LocalDate.of(2024, 1, 15));

        //Created some products to clothing
        Clothing tshirt = new Clothing("C001", "T-Shirt", 19.99, "M", "Cotton");
        Clothing jacket = new Clothing("C002", "Jacket", 59.99, "L", "Leather");

        //here before adding any item to the list, just displaying the items which are created for the name of the products calling by method displayItems();
        System.out.println("=== Before Adding Any Items ===");
        electronicsInventory.displayItems();
        groceriesInventory.displayItems();
        clothingInventory.displayItems();

        //Below you can see, we are going to add the created inventory and assigned details
        System.out.println("\n=== Adding Items ===");
        electronicsInventory.addItem(laptop);
        electronicsInventory.addItem(smartphone);

        groceriesInventory.addItem(milk);
        groceriesInventory.addItem(fruits);

        clothingInventory.addItem(tshirt);
        clothingInventory.addItem(jacket);

        //now displaying the content after adding inventories, you can see the details displayed by calling the displayItems method
        System.out.println("\n=== Inventories After Adding Items ===");
        electronicsInventory.displayItems();
        groceriesInventory.displayItems();
        clothingInventory.displayItems();

        //here we are going to remove the inventory for the specific objects that removed by using method "removeItem"
        System.out.println("\n=== Removing Some Items ===");
        electronicsInventory.removeItem(smartphone);  // remove Smartphone
        groceriesInventory.removeItem(milk);          // remove Milk
        clothingInventory.removeItem(tshirt);         // remove T-Shirt

        //here is the inventory that is being displayed after removing the inventory record, these method is used multiple times for explaining each functionality after it used
        System.out.println("\n=== Inventories After Removing Items ===");
        electronicsInventory.displayItems();
        groceriesInventory.displayItems();
        clothingInventory.displayItems();
    }
}
