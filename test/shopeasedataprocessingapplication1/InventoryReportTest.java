/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elisha
 */
public class InventoryReportTest {

    @Test
    //TC08 - Inventory report is generated using processed data
    public void testInventoryReportGeneration() {
        InventoryReport report = new InventoryReport();
        Map<String, Double> metrics = new HashMap<>();

        metrics.put("TotalSales", 3000.0);
        metrics.put("TransactionCount", 2.0);
        report.generateReport(metrics);
    }
}
