package HW.HW_7.observer;

public interface CreateVacancy {

    public default String createVacancy() {
        Vacancy vacancy = new Vacancy();
        return vacancy.vacancyName;
    }

}