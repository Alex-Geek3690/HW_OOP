package HW.HW_4;

import java.util.ArrayList;
import java.util.Random;

/**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
 */

public class Program {

    public static Random rand = new Random();

    static ArrayList<Apple> addAppleBox(int numb){
        ArrayList<Apple> apple_list = new ArrayList<>();
        for (int i = 0; i < numb; i++) {
            apple_list.add(new Apple());
        }
        return apple_list;
    }
    static ArrayList<Orange> addOrangeBox(int numb){
        ArrayList<Orange> fruit_list = new ArrayList<>();
        for (int i = 0; i < numb; i++) {
            fruit_list.add(new Orange());
        }
        return fruit_list;
    }

    public static void compareBox(Box<?> b1, Box<?> b2){

        System.out.printf("Сравним две коробки %d - %s и %d - %s: ", b1.getNumber_box(), b1.getName(), b2.getNumber_box(), b2.getName());
        if (b1.box_compare(b2)) {
            System.out.println("Коробки весят одинаково");
        } else {
            System.out.println("Вес коробок разный");
        }
    }

    public static void main(String[] args) {
        
        Box<Apple> box1 = new Box<>(addAppleBox(10));
        Box<Apple> box2 = new Box<>(addAppleBox(9));
        Box<Orange> box3 = new Box<>(addOrangeBox(6));
        Box<Orange> box4 = new Box<>(addOrangeBox(15));

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);

        compareBox(box1,box3);
        compareBox(box2,box3);
        compareBox(box3,box4);
    }


}
