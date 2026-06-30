/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.List;

/**
 *
 * @author Elisha
 */
public class DataTransformer implements IDataTransformer {

    @Override
    public List<Record> transformData(List<Record> records) {
        for (Record r : records) {
            // Rounding off tow 2 decmial places
            double roundedAmount =
                    Math.round(r.getAmount() * 100.0) / 100.0;

            // Updating the record with the transformed value
            r.setAmount(roundedAmount);
        }
        System.out.println("Data Transformation Completed");
        return records;
    }
}