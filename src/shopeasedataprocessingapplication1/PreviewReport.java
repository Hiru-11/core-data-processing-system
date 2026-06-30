/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.Map;

/**
 *
 * @author Elisha
 */
public class PreviewReport implements IReportGenerator {

    @Override
    public void generateReport(Map<String, Double> metrics) {

        System.out.println("REPORT PREVIEW");
        System.out.println(
                "Total Sales: "
                + metrics.get("TotalSales")
        );
    }
}
