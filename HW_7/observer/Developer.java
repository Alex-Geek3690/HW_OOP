package HW.HW_7.observer;

public class Developer implements Observer {

    private String name;
    private double salary;

    public Developer(String name) {
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(String vacancyName, String companyName, double salary) {
        if (this.salary < salary) {
            System.out.printf("Разработчик %s >>> Мне нужна эта работа %s! [%s - %f]\n", name, vacancyName, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Разработчик %s >>> Я найду работу получше %s! [%s - %f]\n", name, vacancyName, companyName, salary);
        }
    }

}
