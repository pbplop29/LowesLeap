class Product {
    private int productId;
    private String productName;
    private int productQuantity;
    private double unitPrice;
    private int stock;
    private int remainingStock;
    
    public Product(int productId, String productName, int productQuantity, double unitPrice, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.unitPrice = unitPrice;
        this.stock = stock;

        remainingStock = stock-productQuantity;
    }
    
    public int getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public int getProductQuantity() {
        return productQuantity;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    public int getStock() {
        return stock;
    }
    
    public double getTotalCost() {
        return (productQuantity ) * unitPrice;
    }

    public int getRemainingStock(){
        return remainingStock;
    }
}

public class Three {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", 2, 500.0, 10);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Quantity: " + product.getProductQuantity());
        System.out.println("Unit Price: " + product.getUnitPrice());
        System.out.println("Stock: " + product.getStock());
        System.out.println("Total Cost: " + product.getTotalCost());
        System.out.println("Remaining Stock: " + product.getRemainingStock());
    }
}
