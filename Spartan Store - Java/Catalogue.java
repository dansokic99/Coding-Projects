package Spartan;

/** This interface represents a catalogue which will store all of the
  * items for sale in a linked list, regardless of availability
  * 
  * @author Daniel Sokic
  * 
  * @version 1.0 (Mar. 2018)                                             */

public interface Catalogue {
  
  /**This method returns the item specified by the item number, if the
    * item number is not present, an exception is thrown.
    * 
    * @exception NoValueException the indicated item number is not present */
  
  public Item getItem( String ItemNum );
  
  /**This method returns true if the item specified has a quantity greater than 0, 
    * if the item number is not present, an exception is thrown.
    * 
    * @exception NoValueException the indicated item number is not present */
  
  public boolean checkAvail( String ItemNum );
  
  //This method adds an item to the catalogue
  
  public void addItem( StoreItem newItem );
  
  //This method returns the amount if item in the catalogue
  
  public int getItemAmount();
  
  //This method returns the linked list of items
  
  public Node<StoreItem> getList();
  
  
} //Catalogue