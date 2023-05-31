package HW.HW_6.DIP;

import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

public class PrintReport_3 extends PrintReportBase {

    @Override
    public void output(List<ReportItem> items) {

        String file = "HW/HW_6/DIP/Report.txt";
        try (FileWriter fileWriter = new FileWriter(file, false)) {
            for (ReportItem item : items) {
                fileWriter.write("deccription: " + item.getDescription() + ", amount: " + item.getAmount() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
