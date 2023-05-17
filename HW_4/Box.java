package HW.HW_4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Box<T extends Fruit> {


    private static final AtomicInteger val = new AtomicInteger(1);
    ArrayList<T> fruits;
    String name;
    float weight;
    int number_box;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
        if (fruits.isEmpty()) {
            this.name = "коробка пустая";
        } else {
            this.name = fruits.get(0).getName();
            number_box = val.getAndIncrement();
            this.weight = getWeight();
        }
    }

    public boolean box_compare(Box<?> box){
        return Float.compare(getWeight(), box.getWeight()) == 0;
    }

    public float getWeight() {
        return fruits.get(0).getWeight() * fruits.size();
    }  

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getNumber_box() {
        return number_box;
    }


    @Override
    public String toString() {
        
        return String.format("Коробка № - %d, фрукты - %s, весом - %.2f", number_box, name, weight);
    }

    
}
