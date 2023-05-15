package HW.HW_3;

class Freelancer extends Employee {

    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        ;
        return 20 * 5 * salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Почасовая з/п(ставка): %.2f(руб.); Среднемесячная заработная плата: %.2f (руб.)", name, surName, salary, calculateSalary());
    }
    
}
