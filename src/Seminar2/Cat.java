package Seminar2;

public class Cat {




    private String name;
    int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public String getName() {
        return name;
    }
    public boolean eat (Plate plate) {
        if(plate.getFood()>= appetite){
            plate.decreaseFood(appetite);
            return true;
        } else {
            return false;
        }
        }

    public int getAppetite() {

        return appetite;
    }

    public void setAppetite(int appetite) {

        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }

    public void hungry(boolean setFood) {
    }
}
