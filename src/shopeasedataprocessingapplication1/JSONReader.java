/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Elisha
 */
public class JSONReader implements IFileReader {
    @Override
    public List<Record> readData(String filePath) {

        try {
            // Creating a Gson object to handle JSON parsing
            Gson gson = new Gson();

            // Defining the expected type of data
            java.lang.reflect.Type listType =
                    new TypeToken<List<Record>>() {}.getType();

            // Read and convert JSON file into a List of Record objects
            List<Record> records = gson.fromJson(
                    new FileReader(filePath),
                    listType
            );

            // Displaying a success message
            System.out.println("JSON File Loaded Successfully");

            // Returning the list of records to the caller
            return records;

        } catch (Exception e) {

            // Error message for unsuccessful reading
            System.out.println("Error Reading JSON File");
        }

        // Return empty list if an error occurs
        return new ArrayList<>();
    }
}