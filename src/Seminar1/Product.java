package Seminar1;

public class Product {
    protected String name;
    protected int price;
    protected int weight;


    public String displayInfo() {
        return String.format("%s - Вес: %s - %d", name, weight, price);

    }
}