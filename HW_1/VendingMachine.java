package HW.HW_1;


import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
       }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume, int fat){
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if (product.getName() == name && ((BottleOfMilk)product).getVolume() == volume && ((BottleOfMilk)product).getFat() == fat) {
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;
    }


    public Chocolate getChocolate(String name, double price, int calories, String color){
        for (Product product : products) {
            if (product instanceof Chocolate) {
                if (product.getName() == name && product.getPrice() == price && ((Chocolate)product).getCalories() == calories && ((Chocolate)product).getColor() == color) {
                    return (Chocolate)product;
                }
            }
        }
        return null;
    }

    //TODO: Разработать метод получения бутылки с молоком самостоятельно



}
