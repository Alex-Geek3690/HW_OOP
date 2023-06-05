package HW.HW_7.observer;

public class Student implements Observer {

    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String vacancyName, String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа %s! [%s - %f]\n", name, vacancyName, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше %s! [%s - %f]\n", name, vacancyName, companyName, salary);
        }
    }
}
