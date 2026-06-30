/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.List;
import java.util.Map;

/**
 *
/**
 *
 * @author Elisha
 */
public class DataProcessingController {
    // Singleton instance
    private static DataProcessingController instance;

    // Services that are used in the pipeline
    private DataIngestionService ingestionService;
    private IDataCleaner cleaner;
    private IDuplicateRemover duplicateRemover;
    private IValidator validator;
    private IDataTransformer transformer;
    private IDataAnalyzer analyzer;
    private IReportGenerator reportGenerator;

    // Stored results after the processing
    private List<Record> processedRecords;
    private Map<String, Double> metrics;

    // Private constructor 
    private DataProcessingController(
            IDataCleaner cleaner,
            IDuplicateRemover duplicateRemover,
            IValidator validator,
            IDataTransformer transformer,
            IDataAnalyzer analyzer) {

        this.ingestionService = new DataIngestionService();
        this.cleaner = cleaner;
        this.duplicateRemover = duplicateRemover;
        this.validator = validator;
        this.transformer = transformer;
        this.analyzer = analyzer;

        // default report type 
        this.reportGenerator = new SalesReport();
    }

    // Getter method
    public static DataProcessingController getInstance() {
        if (instance == null) {
            instance = new DataProcessingController(
                    new DataCleaner(),
                    new DuplicateRemover(),
                    new Validator(),
                    new DataTransformer(),
                    new DataAnalyzer()
            );
        }
        return instance;
    }

    // Allowing to change the report type at runtime
    public void setReportGenerator(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }


    public void processData(String filePath, IFileReader reader) {
        // Set selected reader 
        ingestionService.setReader(reader);

        // Reading raw data
        List<Record> records = ingestionService.read(filePath);
        System.out.println("\nRaw data size: " + records.size());
        System.out.println(records);

        // cleaning data
        records = cleaner.cleanData(records);
        System.out.println("\nAfter cleaning: " + records.size());

        // removing duplicates
        records = duplicateRemover.removeDuplicates(records);
        System.out.println("\nAfter the removal of duplicates: " + records.size());

        // validation
        records.removeIf(r -> !validator.validate(r));
        System.out.println("\nAfter validation: " + records.size());

        // transformating the data
        records = transformer.transformData(records);
        System.out.println("\nAfter transformation:");
        System.out.println(records);

        // storing the result
        this.processedRecords = records;

        // analysing
        this.metrics = analyzer.analyze(records);
        System.out.println("\nFinal Data metrics:");
        System.out.println(metrics);

        System.out.println("\nData processing successfully completed!!");
    }

    // Report Generation
    public void generateReport() {
        if (metrics == null) {
            System.out.println("Data hasnt been processed yet");
            return;
        }
        reportGenerator.generateReport(metrics);
    }
}