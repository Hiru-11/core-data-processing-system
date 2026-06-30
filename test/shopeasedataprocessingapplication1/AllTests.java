/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

    CSVReaderTest.class,
    DataCleanerTest.class,
    DataTransformerTest.class,
    DataProcessingControllerTest.class,
    DuplicateRemoverTest.class,
    InventoryReportTest.class,
    JSONReaderTest.class,
    SalesReportTest.class,
    ValidatorTest.class

})
public class AllTests {
}
