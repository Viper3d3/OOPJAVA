package Seminar1;

public class Drinks extends Product {
    public int volume;
    public int getVolume() {
        return volume;
    }
    public Drinks( String name, int volume){
        this.name = name;
        this.volume = volume;

    }

    public String displayInfo() {
        return String.format("%s Обьем: %s - %s - %d", name, volume, price);

    }
}
