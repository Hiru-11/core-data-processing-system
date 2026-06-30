/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elisha
 */
public class JSONReaderTest {
    
    public JSONReaderTest() {
    }

    @Test
    // TCO2 - A valid JSON file is uploaded using JSONReader
    public void testReadData() {
        JSONReader reader = new JSONReader();
        List<Record> records = reader.readData("data.json");

        // To check if the list actually exist
        assertNotNull(records);
        // To check if the list contains data
        assertFalse(records.isEmpty());
    }
    
}
