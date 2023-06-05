package HW.HW_7.observer;

import java.util.Random;

public class Company implements CreateVacancy {

    private Random random;
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и
     * передавать
     * объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee() {
        String vacancy = createVacancy();
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(vacancy, nameCompany, salary);
    }

}
