package HW.HW_6.SPR;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFormate {

   Order saveJsonOrder;

    public JsonFormate(Order saveJsonOrder) {
    this.saveJsonOrder = saveJsonOrder;
}

    public void saveToJson() {
        String fileName = "HW/HW_6/SPR/Order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ saveJsonOrder.getClientName() + "\",\n");
            writer.write("\"product\":\""+ saveJsonOrder.getProduct()+"\",\n");
            writer.write("\"qnt\":"+ saveJsonOrder.getQnt()+",\n");
            writer.write("\"price\":"+ saveJsonOrder.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
