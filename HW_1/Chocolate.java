package HW.HW_1;

public class Chocolate extends Product {
    private int calories;
    private String color;

    public int getCalories() {
        return calories;
    }
    public String getColor() {
        return color;
    }

    public Chocolate(String name, double price, int calories, String color) {
        super(name, price);
        this.calories = calories;
        this.color = color;
    }

  @Override
  String displayInfo() {
      return String.format("%s - %s - %f - калории: %d - цвет: %s", brand, name, price, calories, color);
  }
}
