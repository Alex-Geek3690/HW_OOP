package HW.HW_6.DIP;

import java.util.List;

public class PrintReport_2 extends PrintReportBase {

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
    
    
}
