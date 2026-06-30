/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */
public class SalesReport extends ReportGenerator {

    @Override
    protected void processMetrics(java.util.Map<String, Double> metrics) {
        System.out.println("Processing the Sales Metrics");
    }

    @Override
    protected void formatData(java.util.Map<String, Double> metrics) {
        System.out.println("Formatting the Sales Report");
    }

    @Override
    public void exportReport(java.util.Map<String, Double> metrics) {

        System.out.println("SALES REPORT");
        System.out.println("Total Sales: " + metrics.get("TotalSales"));
        System.out.println("Transactions: " + metrics.get("TransactionCount"));
        System.out.println("Average Sales: " + metrics.get("AverageSales"));
    }
}
