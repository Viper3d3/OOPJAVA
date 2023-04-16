package Seminar1;

import java.util.List;


public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getDrinks(String name, double volume) {
        for (Product product: products) {
            if (product instanceof Drinks){
                Drinks bottle = ((Drinks)product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }
    }


