import Seminar1.Chocolate;
import Seminar1.Drinks;
import Seminar1.Product;
import Seminar1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product chocolate1 = new Chocolate("Snikers", 100, 70);
        Product chocolate2 = new Chocolate("Mars", 70, 65);
        Product drinks1 = new Drinks("Water(Holy Spring)", 1);
        Product drinks2 = new Drinks("Coca-Cola", 500);
        Product drinks3 = new Drinks("Pepsi", 500);


        List<Product> products = new ArrayList<>();
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(drinks1);
        products.add(drinks2);
        products.add(drinks3);

        VendingMachine vendingMachine = new VendingMachine(products);

        Product drinksRes = vendingMachine.getDrinks("Pepsi", 500);
        if (drinksRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(drinksRes.displayInfo());
        } else {
            System.out.println("Такой бутылки  нет в автомате.");
        }

    }


}
