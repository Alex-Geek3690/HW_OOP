package HW.HW_2;

public class MainClass {
    public static void main(String[] args) {
        Cat cat_1 = new Cat("Happy", 40);
        Cat cat_2 = new Cat("Barsik", 50);
        Cat cat_3 = new Cat("Leo", 20);
        Cat cat_4 = new Cat("Marsik", 50);

        Plate plate = new Plate(150);

        Cat[] cats = new Cat[] { cat_1, cat_2, cat_3, cat_4 };
        System.out.print("Тарелка наполнена едой, в ней:");
        plate.info();
        System.out.print("Коты: кушать!");

        for (Cat cat : cats) {
            if (plate.getFood() > cat.getAppetite()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.printf("\n%s съел %d еды\n\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                System.out.print("Осталось еды в тарелке:");
                plate.info();
            } else {
                plate.foodAdd(cat.getAppetite() - plate.getFood());
                System.out.printf("%s съел %d еды\n\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.print("Осталось еды в тарелке:");
                plate.info();
            }
        }
        for (Cat cat : cats) {
            System.out.printf("\n%s сытый %b", cat.getName(), cat.satiety());
        }
    }
}
