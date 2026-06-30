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
public class DataTransformerTest {
    
    public DataTransformerTest() {
    }

    @Test
    //TC06 - Data transformation is applied on valid records using DataTransformer
    public void testTransformData() {
        DataTransformer transformer = new DataTransformer();
        List<Record> records = new ArrayList<>();
        records.add(new Record("T001","C001","I001", 1000.567, 2));

        List<Record> result = transformer.transformData(records);
        assertEquals(1000.57,result.get(0).getAmount(),0.01);
    }
    
}
