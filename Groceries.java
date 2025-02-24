import java.time.LocalDate;

public class Groceries extends Product {
    private LocalDate expirationDate;

    public Groceries(String productId, String name, double price, LocalDate expirationDate) {
        super(productId, name, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expires on: " + expirationDate;
    }
}