import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        BottleOfWatter bottleOfWatter1 = new BottleOfWatter("Brand #2", "Name #2", 250, 100);
        System.out.println(bottleOfWatter1.displayInfo());

        Product bottleOfWatter2 = new BottleOfWatter("Brand #2", "Name #2", 250, 100);
        System.out.println(bottleOfWatter2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 250, 100, 1);
        System.out.println(bottleOfMilk1.displayInfo());

        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 250, 100, 1);
        System.out.println(bottleOfMilk2.displayInfo());

        Chocolate chocolate1 = new Chocolate("Mondelez", "Milka", 300, 200);

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWatter1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWatter2);
        list.add(chocolate1);

        VendingMachine vendingMachine = new VendingMachine(list);

        Chocolate chocolateRes = vendingMachine.getChocolate("Milka", 200);

        if (chocolateRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        } else {
            System.out.println("Такой плитки шоколада нет в автомате");
        }

        // BottleOfWatter bottleOfWatterRes = vendingMachine.getBottleOfWatter("Name #2", 150);

        // if (bottleOfWatterRes != null) {
        //     System.out.println("Вы купили: ");
        //     System.out.println(bottleOfWatterRes.displayInfo());
        // } else {
        //     System.out.println("Такой бутылки с водой нет в автомате");
        // }

    }
}