package HW.HW_2;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void foodAdd(int addportion) {
        this.food += addportion;
        System.out.printf("\nДобавлено %d еды\n\n", addportion);
    }
}
