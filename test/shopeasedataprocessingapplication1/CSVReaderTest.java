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
public class CSVReaderTest {
    
    public CSVReaderTest() {
    }

    @Test
    // TC01 - A valid CSV file is uploaded using CSVReader
    public void testReadData() {
        CSVReader reader = new CSVReader();
        List<Record> records = reader.readData("data.csv");
        
    // To check if the list actually exist
        assertNotNull(records);
     // To check if the list contains data
        assertFalse(records.isEmpty());
    }
    
    @Test
    //TC09 - An empty CSV file is uploaded to the system
    public void testEmptyCSVFile() {
    CSVReader reader = new CSVReader();

    List<Record> records = reader.readData("empty.csv");
    assertNotNull(records);
    assertEquals(0, records.size());
    }
    
    @Test
    //TC11 - A corrupted CSV file is uploaded
public void testCorruptedCSVFile() {
    CSVReader reader = new CSVReader();
    List<Record> records = reader.readData("corrupted.csv");
    assertNotNull(records);
}
@Test
public void testInvalidFilePath() {
// TC12 - An Invalid file path is supplied to the reader 
    CSVReader reader =  new CSVReader();
    List<Record> records =reader.readData("doesntexist.csv");
    assertNotNull(records);
    assertEquals(0, records.size());
}
    
}
