package Spartan;

import java.io.*;

/** This interface represents an item within the cart of a customer. 
  * A CartItem has a price, description, item number and quantity.
  * 
  * @author Daniel Sokic
  * 
  * @version 1.0 (Mar. 2018)                                             */

public class CartItem implements Item, Serializable {
  
  private static final long  serialVersionUID = 99990002L;
  
  private double price;
  private String description;
  private String itemNum;
  private int quantity;
  
  //This constructor takes parameters for the instance variables and sets their values
  
  public CartItem( double p, String d, String in, int q ){
    
    price = p;
    description = d;
    itemNum = in;
    quantity = q;
    
  }
  
  /** This method returns the price of the item.
    * 
    * @return Double the price                                           */
  
  public double getPrice ( ){
    
    return price;
    
  }
  
  /** This method returns the description of the item.
    * 
    * @return String the description                                           */
  
  public String getDesc ( ){
    
    return description;
    
  }
  
  /** This method returns the number of the item.
    * 
    * @return String the item number                                           */
  
  public String getItemNum ( ){
    
    return itemNum;
    
  }
  
  /** This method returns the quantity of the item.
    * 
    * @return Integer the quantity                                           */
  
  public int getQuant ( ){
    
    return quantity;
    
  }
  
  /** This method updates the price of the item
    * 
    * @param newPrice the new price that will be set to the item */
    
  public void setPrice ( double newPrice ){
    
    price = newPrice;
    
  }
  
  /** This method updates the description of the item
    * 
    * @param newDescription the new description assigned to the item */
  
  public void setDesc ( String newDescription ){
    
    description = newDescription;
    
  }
  
  /** This method updates the number of the item
    * 
    * @param newItemNumber the new item number that will be assigned to the item */
  
  public void setItemNum ( String newItemNumber ){
    
    itemNum = newItemNumber;
    
  }
  
  /** This method adds to the quantity of the item
    * 
    * @param newQuantity how much will be added to the quantity */
  
  public void addQuant ( int newQuantity ){
    
    quantity += newQuantity;
    
  }
    
  /** This method removes from the quantity of the item
    * 
    * @param newQuantity how much will be removed from the quantity */
  
  public void removeQuant ( int newQuantity ){
    
    quantity -= newQuantity;
    
  }
  
  
} //Item