package Test;

public class Person implements  Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Его имя: %S",name);
    }

    @Override
    public void showInfo() {
        System.out.println("Его имя:" + name);

    }







}
