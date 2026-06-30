/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elisha
 */
public class DataCleanerTest {
    
    public DataCleanerTest() {
    }

    @Test
    // TC03 - Dataset containing records with valid and invalid transaction IDs is processed through DataCleaner
    public void testCleanData() {
        DataCleaner cleaner = new DataCleaner();
        List<Record> records = new ArrayList<>();
        records.add(new Record("T001","C001","I001",100,1));
        records.add(new Record("","C002","I002",200,1));

        List<Record> result = cleaner.cleanData(records);
        assertEquals(1, result.size());
    }
    
}
