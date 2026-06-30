/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Elisha
 */
public interface IDataAnalyzer {
    Map<String, Double> analyze(List<Record> records);
}
