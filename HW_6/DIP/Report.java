package HW.HW_6.DIP;

import java.util.ArrayList;
import java.util.List;

public class Report {

    private List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void outputReport(){
        PrintReportBase printReport1 = new PrintReport_1();
        printReport1.output(items);
    }
    public void printReport_all(){
        PrintReportBase printReport2 = new PrintReport_2();
        printReport2.output(items);
    }
    public void saveReportToFile(){
        PrintReportBase printReport3 = new PrintReport_3();
        printReport3.output(items);
    }

}
