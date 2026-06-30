/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elisha
 */
public class DataAnalyzer implements IDataAnalyzer {

    @Override
    public Map<String, Double> analyze(List<Record> records) {
        // Variable to store the total sales amount
        double totalSales = 0;
        int count = records.size();

        for (Record r : records) {
            totalSales += r.getAmount();
        }

        // To Calculate average safely by avoiding the division by 0
        double averageSales = (count == 0) ? 0 : totalSales / count;

        // Map to store analysis results
        Map<String, Double> metrics = new HashMap<>();

        metrics.put("TotalSales", totalSales);
        metrics.put("TransactionCount", (double) count);
        metrics.put("AverageSales", averageSales);
        
        System.out.println("Data Analysis Completed");
        return metrics;
    }
}
