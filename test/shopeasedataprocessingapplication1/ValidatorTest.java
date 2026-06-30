/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shopeasedataprocessingapplication1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elisha
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

    @Test
    // TC05 - Valid transaction data is validated using Validator
    public void testValidate() {
        Validator validator = new Validator();
        Record record = new Record("T001","C001","I001",1000,2);

        assertTrue(validator.validate(record));
    }
    
    @Test
    public void testInvalidRecord() {
//TC13 - Records with invalid values (negative amount or quantity) are processed
        Validator validator = new Validator();
        Record record = new Record("T001","C001","I001",-1000,-2);
        assertFalse(validator.validate(record));
}
    
}
