public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        processPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private void processPrice(double price) {
        if (price < 100) {
            this.price = 250;
        } else {
            this.price = price;
        }
    }

    private void processName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "<NAME>";
        } else {
            this.name = name;
        }
    }

    private void processBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "<BRAND>";
        } else {
            this.brand = brand;
        }
    }

    public Product(String brand, String name, double price) {
        processBrand(brand);
        processName(name);
        processPrice(price);
    }

    public Product(String name, double price) {
        this(name, "BRAND", price);
    }

    public Product(String name) {
        this(name, 250);
    }

    public Product() {
        this("<NAME>");
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", this.name, this.brand, this.price);
    }
}
