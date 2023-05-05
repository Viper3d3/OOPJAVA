package Test;

public class Main {
    public static void main(String[] args) {
        Info person1 = new Person("Bob");
        Info animal1 = new Animal(2);
        person1.showInfo();
        animal1.showInfo();
        outPrintInfo(person1);
        outPrintInfo(animal1);
    }
    public static void outPrintInfo(Info info){
        info.showInfo();
    }
}
