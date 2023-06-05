package HW.HW_7.observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String vacancyName, String nameCompany, double salary);

}
