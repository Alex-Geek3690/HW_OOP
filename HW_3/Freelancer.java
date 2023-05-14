package HW.HW_3;

class Freelancer extends Employee {

    

    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        //TODO: Для фрилансера - return 20 * 5 * salary
        return 0;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фриланс): %.2f (руб.)", name, surName, salary);
    }
    
}
