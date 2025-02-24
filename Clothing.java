public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String productId, String name, double price, String size, String material) {
        super(productId, name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size + ", Material: " + material;
    }
}