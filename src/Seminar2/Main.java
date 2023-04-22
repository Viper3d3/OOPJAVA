package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Pety",2,false);
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Boris", 10),
                new Cat("Basy", 15),
                new Cat("Misha", 7),
                new Cat("Snejok", 11),
                new Cat("Petr", 9),
                new Cat("Alex", 4),
                new Cat("Bruno", 8),
                new Cat("Washington", 16),
                new Cat("Meow", 18)

        };


        Plate plate = new Plate(100);
        plate.info();
        for (Cat entry : cats) {
            if (entry.eat(plate)) {
                System.out.println(entry.getName() + " скушал!");
            } else {
                System.out.println(entry.getName() + " не ел, не хватает корма.");
            }
            plate.info();
        }
    }
}








