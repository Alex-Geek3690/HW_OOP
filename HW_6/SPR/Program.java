package HW.HW_6.SPR;

public class Program {

    //TODO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        JsonFormate jsonFormate = new  JsonFormate(order);
        XmlFormate xmlFormate = new XmlFormate(order);
        order.inputFromConsole();
        jsonFormate.saveToJson();
        xmlFormate.saveToXml();
    }

}
