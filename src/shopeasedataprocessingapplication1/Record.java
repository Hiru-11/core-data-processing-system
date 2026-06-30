/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

/**
 *
 * @author Elisha
 */
//Provate attributes
public class Record {
    private String transactionId;
    private String customerId;
    private String itemId;
    private double amount;
    private int quantity;

public Record(String transactionId,String customerId,String itemId,double amount,int quantity){
    this.transactionId = transactionId;
    this.customerId = customerId;
    this.itemId = itemId;
    this.amount = amount;
    this.quantity = quantity;
    }


//Get methods
public String getTransactionId() {
        return transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getItemId() {
        return itemId;
    }

    public double getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }
  
 //Set methods
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return transactionId + " | " + customerId + " | " +  itemId + " | " +  amount +  " | " + quantity;
    }

}
