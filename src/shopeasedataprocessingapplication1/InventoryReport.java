/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */
public class InventoryReport extends ReportGenerator {

    @Override
    protected void processMetrics(java.util.Map<String, Double> metrics) {
        System.out.println("Processing Inventory Metrics");
    }

    @Override
    protected void formatData(java.util.Map<String, Double> metrics) {
        System.out.println("Formatting Inventory Report");
    }

    @Override
    public void exportReport(java.util.Map<String, Double> metrics) {

    System.out.println("INVENTORY REPORT");
    System.out.println("Items Processed: " + metrics.get("TransactionCount"));
    System.out.println("Total Inventory Value: " + metrics.get("TotalSales"));
    }
}
