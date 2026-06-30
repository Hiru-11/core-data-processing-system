/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Elisha
 */
public class CSVReader implements IFileReader {
    public List<Record> readData(String filePath) {
        // List to store all records
        List<Record> records = new ArrayList<>();

        try {

            // Create BufferedReader to read CSV file line by line
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            // Skip header row
            br.readLine();

            // Read each line until end of file
            while ((line = br.readLine()) != null) {
                // Split line by comma
                String[] data = line.split(",");
                // Create Record object from CSV data
                Record record = new Record(
                        data[0],                      // transactionId
                        data[1],                      // customerId
                        data[2],                      // itemId
                        Double.parseDouble(data[3]), // amount
                        Integer.parseInt(data[4])    // quantity
                );

                // Add record to list
                records.add(record);
            }

            // Close file reader
            br.close();
            System.out.println("CSV File Loaded Successfully");

        } catch (Exception e) {
            // To handle the errors 
            System.out.println("Error Reading CSV File");

        }
        return records;
    }
}