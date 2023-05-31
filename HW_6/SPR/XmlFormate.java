package HW.HW_6.SPR;

import java.io.FileWriter;
import java.io.IOException;

public class XmlFormate{

    Order saveXmlOrder;

    public XmlFormate(Order saveXmlOrder) {
        this.saveXmlOrder = saveXmlOrder;
    }

    public void saveToXml() {
        String fileName = "HW/HW_6/SPR/Order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ saveXmlOrder.getClientName() + "\",\n");
            writer.write("\"product\":\""+ saveXmlOrder.getProduct()+"\",\n");
            writer.write("\"qnt\":"+ saveXmlOrder.getQnt()+",\n");
            writer.write("\"price\":"+ saveXmlOrder.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
