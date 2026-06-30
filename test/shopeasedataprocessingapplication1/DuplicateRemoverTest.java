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
public class DuplicateRemoverTest {
    
    public DuplicateRemoverTest() {
    }

    @Test
    //TC04 - Duplicate transaction records are processed in the system
    public void testRemoveDuplicates() {
        DuplicateRemover remover = new DuplicateRemover();
        List<Record> records = new ArrayList<>();
        records.add(new Record("T001","C001","I001",100,1));
        records.add(new Record("T001","C002","I002",200,2));
        List<Record> result = remover.removeDuplicates(records);

        assertEquals(1, result.size());
    }
    
}
