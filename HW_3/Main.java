package HW.HW_3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static Random rand = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        
        int salary = rand.nextInt(200, 300);
        int index = rand.nextInt(300, 500);
        
        if (rand.nextBoolean()) {
            return new Worker(names[rand.nextInt(10)], surnames[rand.nextInt(10)], salary * index);
        } else {
            return new Freelancer(names[rand.nextInt(10)], surnames[rand.nextInt(10)], salary);
        }
        
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new SalaryComparator());

        System.out.println("\n*** Отсортированный список сотрудников по з/п***\n\n");
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new NameComparator());

        System.out.println("\n*** Отсортированный список сотрудников по имени***\n\n");
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
