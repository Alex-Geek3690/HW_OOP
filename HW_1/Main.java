package HW.HW_1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // Product product1 = new Product();
        // System.out.println(product1.displayInfo());

        // Product product2 = new Product("Бутылка с молоком", 200);
        // System.out.println(product2.displayInfo());

        // Product product3 = new Product("Ок", "11", -100);
        // System.out.println(product3.displayInfo());

        //product3.setPrice(-50.5);
       //product3.name = "____";
       // product3.price = -50.5;

        // System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко1", 100, 1, 5);
        Product bottleOfMilk2 = new BottleOfMilk("Молоко2", 150, 2, 2);
        Product bottleOfMilk3 = new BottleOfMilk("Молоко3", 200, 1, 3);

        Product chocolate1 = new Chocolate("шоколад1", 25.5, 350, "темный");
        Product chocolate2 = new Chocolate("шоколад2", 50.99, 420, "белый");
        Product chocolate3 = new Chocolate("шоколад3", 74, 350, "темный");
        Product chocolate4 = new Chocolate("шоколад4", 123.49, 630, "темный");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);

        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);

        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);           


        VendingMachine machine = new VendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода1", 2);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        BottleOfMilk bottleOfMilkRes = machine.getBottleOfMilk("Молоко1", 1, 5);
        if (bottleOfMilkRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        } else {
            System.out.println("Такой бутылки нет.");
        }


        Chocolate chocolateRes = machine.getChocolate("шоколад1", 25.5, 350, "темный");
        if (chocolateRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        } else {
            System.out.println("Такого шоколада нет в автомате.");
        }

    }


}