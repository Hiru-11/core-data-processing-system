/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elisha
 */
public class DataCleaner implements IDataCleaner {

    @Override
    public List<Record> cleanData(List<Record> records) {
        List<Record> cleaned = new ArrayList<>();

        for (Record r : records) {
            // "Only add the record if the transaction ID is not null and not empty
            if (r.getTransactionId() != null &&
                !r.getTransactionId().isEmpty()) {
                cleaned.add(r);
            }
        }

        System.out.println("Data Cleaning Completed");
        return cleaned;
    }
}

