public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public String toString() {
        // Here calling the parent toString() so we can get those detail and adding warranty info for it
        return super.toString() + ", Warranty: " + warrantyPeriod + " months";
    }
}
