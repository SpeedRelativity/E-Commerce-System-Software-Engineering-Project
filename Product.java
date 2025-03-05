
public class Product {
    private String ProductId;
    private static int counter = 0;
    private String name;
    private String supplier;

    public Product(String name, String supplier) {
        this.ProductId = "" + counter++;
        this.name = name;
        this.supplier = supplier;
    }

    public String getId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
