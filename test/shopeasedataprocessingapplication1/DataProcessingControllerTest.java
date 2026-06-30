/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elisha
 */
public class DataProcessingControllerTest {
    
    public DataProcessingControllerTest() {
    }

   @Test
public void testSingleRecordProcessing() {
//TC10 - A dataset containing only one record is processed
    DataAnalyzer analyzer = new DataAnalyzer();
    List<Record> records = new ArrayList<>();
    records.add(new Record("T001","C001","I001",1000,1));
    Map<String, Double> result = analyzer.analyze(records);

    assertEquals(1.0,result.get("TransactionCount"),0.001
    );
}
    
}
