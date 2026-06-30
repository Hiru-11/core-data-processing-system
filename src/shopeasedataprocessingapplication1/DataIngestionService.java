/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.List;

/**
 *
 * @author Elisha
 */
public class DataIngestionService {
    private IFileReader reader;

    
    public void setReader(IFileReader reader) {
        this.reader = reader;   
    }

    
    public List<Record> read(String filePath) {
        return reader.readData(filePath);   
    }
}