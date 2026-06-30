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
public abstract class ReportGenerator implements IReportGenerator, IExportable {
    
    @Override
    public final void generateReport(Map<String, Double> metrics) {
        processMetrics(metrics);
        formatData(metrics);
        exportReport(metrics);
    }

    protected abstract void processMetrics(Map<String, Double> metrics);
    protected abstract void formatData(Map<String, Double> metrics);

    @Override
    public abstract void exportReport(Map<String, Double> metrics);
}