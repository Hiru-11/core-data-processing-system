/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */
public class ShopEaseDataProcessingApplication1 {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {  
        DataProcessingController controller = DataProcessingController.getInstance();

        // processing data
        System.out.println("\nPROCESSING DATA");
        controller.processData("data.json", new JSONReader());
        
        System.out.println("\nPREVIEW REPORT");
        controller.setReportGenerator(new PreviewReport());
        controller.generateReport();

        // The reports generated
        System.out.println("\nSALES REPORT");
        controller.setReportGenerator(new SalesReport());
        controller.generateReport();

        System.out.println("\nINVENTORY REPORT");
        controller.setReportGenerator(new InventoryReport());
        controller.generateReport();

        System.out.println("\nCUSTOMER REPORT");
        controller.setReportGenerator(new CustomerReport());
        controller.generateReport();
        
    }
}

    

