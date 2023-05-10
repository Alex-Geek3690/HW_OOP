package HW.HW_2;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Happy", 15);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat();
        // plate.setFood(plate.getFood() - cat.getAppetite());
        // plate.info();
        if (plate.getFood() > cat.getAppetite()) {
            plate.setFood(plate.getFood() - cat.getAppetite());
        } else {
            System.out.println("Наполните тарелку едой снова");
        }
    }
}
