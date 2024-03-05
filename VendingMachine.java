import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWatter getBottleOfWatter(String name, int volume) {
        for (Product product: products) {
            if (product instanceof BottleOfWatter) {
                BottleOfWatter bottleOfWatter = (BottleOfWatter)product;
                if (bottleOfWatter.getName().equals(name) && bottleOfWatter.getVolume() == volume)
                    return bottleOfWatter;
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, double calories) {
        for (Product product: products) {
            if (product instanceof Chocolate) {
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name) && chocolate.getCalories() == calories)
                    return chocolate;
            }
        }
        return null;
    }

        
}
