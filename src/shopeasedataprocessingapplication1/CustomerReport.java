/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */
public class CustomerReport extends ReportGenerator {

    @Override
    protected void processMetrics(java.util.Map<String, Double> metrics) {
        System.out.println("Processing Customer Metrics");
    }

    @Override
    protected void formatData(java.util.Map<String, Double> metrics) {
        System.out.println("Formatting the Customer Report");
    }

    @Override
    public void exportReport(java.util.Map<String, Double> metrics) {
        System.out.println("CUSTOMER REPORT");
        System.out.println("Customers Served: " + metrics.get("TransactionCount"));
        System.out.println("Average Customer Purchase: " + metrics.get("AverageSales"));
    }
}
