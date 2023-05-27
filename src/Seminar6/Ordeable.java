package Seminar6;

public interface Ordeable {
    String getClientName();
    String getProduct();
    int getQnt();
    double getPrice();
    void save(Saveable saver);
}
