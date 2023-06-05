package HW.HW_7.observer;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(String vacancyName, String companyName, double salary);

}
