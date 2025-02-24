public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //toString for formatted output
    @Override
    public String toString() {
        return "ProductID: " + productId +
                ", Name: " + name +
                ", Price: $" + price;
    }
}
