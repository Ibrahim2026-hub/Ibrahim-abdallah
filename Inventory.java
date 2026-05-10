public class Product {
    // Instance fields
    String name;
    String category;
    double price;
    int quantity;

    // Static field
    static int totalProductsCreated = 0;

    // 2-arg constructor
    Product(String name, String category) {
        this.name = name;
        this.category = category;
        this.price = 0.0;
        this.quantity = 0;

        totalProductsCreated++;
    }

    // 4-arg constructor
    Product(String name, String category, double price, int quantity) {
        this(name, category); // constructor chaining
        this.price = price;
        this.quantity = quantity;
    }

    // Returns price × quantity
    double getTotalValue() {
        return price * quantity;
    }

    // Applies discount
    void applyDiscount(double percent) {
        price = Math.max(0.0, price - (price * percent / 100));
    }

    // Returns true if quantity > 0
    boolean isInStock() {
        return quantity > 0;
    }

    // Returns formatted label
    String getLabel() {
        String stockStatus = isInStock() ? "IN STOCK" : "OUT OF STOCK";

        return String.format(
                "%-12s %-20s Price: %.2f Qty: %d Total: %.2f %s",
                category.toUpperCase(),
                name,
                price,
                quantity,
                getTotalValue(),
                stockStatus
        );
    }

    // Static method
    static int getTotalProductsCreated() {
        return totalProductsCreated;
    }
}

public class Inventory {
    public static void main(String[] args) {

        // Create products
        Product laptop = new Product("Laptop", "Electronics", 1200.00, 5);
        Product tshirt = new Product("T-Shirt", "Clothing", 15.00, 20);
        Product book = new Product("Java Programming", "Books", 45.00, 0);
        Product rice = new Product("Rice", "Food", 32.50, 10);

        // Apply 10% discount to laptop
        laptop.applyDiscount(10);

        // Store in array
        Product[] products = {laptop, tshirt, book, rice};

        // Header
        System.out.println("==============================================================");
        System.out.println("                CS 234 - PRODUCT INVENTORY REPORT");
        System.out.println("==============================================================");

        double totalInventoryValue = 0;

        // Assume first product is most valuable
        Product mostValuable = products[0];

        // Print products
        for (Product p : products) {
            System.out.println(p.getLabel());

            totalInventoryValue += p.getTotalValue();

            if (p.getTotalValue() > mostValuable.getTotalValue()) {
                mostValuable = p;
            }
        }

        // Summary
        System.out.println("==============================================================");
        System.out.println("Total Products Created : " +
                Product.getTotalProductsCreated());

        System.out.printf("Total Inventory Value  : %.2f\n",
                totalInventoryValue);

        System.out.printf("Most Valuable Product  : %s (%.2f)\n",
                mostValuable.name,
                mostValuable.getTotalValue());

        System.out.println("==============================================================");
    }
} {
    
}
