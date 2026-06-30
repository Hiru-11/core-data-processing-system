/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */
public class Validator implements IValidator {

    @Override
    public boolean validate(Record record) {
        return record.getAmount() > 0
                && record.getQuantity() > 0;
    }
}
