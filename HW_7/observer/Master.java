package HW.HW_7.observer;

public class Master implements Observer {
    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String vacancyName, String companyName, double salary) {
        if (this.salary < salary) {
            System.out.printf("Мастер %s >>> Мне нужна эта работа %s! [%s - %f]\n", name, vacancyName, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Мастер %s >>> Я найду работу получше %s! [%s - %f]\n", name, vacancyName, companyName,salary);
        }
    }
}
