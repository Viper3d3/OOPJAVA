package Test;

public class Animal implements Info {
    public int id;




    public Animal(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("У животного ID: %S",id);
    }




    @Override
    public void showInfo() {
        System.out.println("Его id:" + id);
    }
}
