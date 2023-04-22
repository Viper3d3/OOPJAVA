package Seminar2;

public class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;
    }

    public void info() {

        System.out.println("plate: " + food);
    }

    public int getFood() {

        return food;
    }

    public boolean setFood(int food) {

        return true;


    }
    public void decreaseFood(int amount) {
        food -= amount;
    }
}