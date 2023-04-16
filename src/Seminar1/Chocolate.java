package Seminar1;

public class Chocolate extends Product {
    public int weight;


    public Chocolate(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;


    }

    public String displayInfo() {
        return String.format("%s  Вес: %s гр.  %d руб", name, weight, price);

    }
}
