package HW.HW_7.observer;

import java.util.Random;

public class Vacancy {

    public Vacancy() {}

    String[] vacancies = {"Программист", "Юрист", "Уборщик", "Бухгалтер"};

    Random random = new Random();
    String vacancyName = vacancies[random.nextInt(vacancies.length)];


}
