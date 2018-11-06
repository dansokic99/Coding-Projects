package Spartan;

/** This interface represents a customer who will interact with and hold
  * a cart. A customer will have an ID and password. 
  * 
  * @author Daniel Sokic
  * 
  * @version 1.0 (Mar. 2018)                                             */

public interface Customer {
  
  /** This method returns the customer's ID.
    *
    * @return  String  the userID.                       */
  
  public String getID ();
  
  /** This method returns the customer's password.
    *
    * @return  String  the password.                       */
  
  public String getPassword();
  
  /** This method returns the cart asssociated with the customer
    *
    * @return  Cart  the cart.                       */
  
  public Cart getCart();
  
  /** This method returns the address asssociated with the customer
    *
    * @return  String  the address.                       */
  
  public String getAddress();
  
  /** This method returns the name asssociated with the customer
    *
    * @return  String  the user's name.                       */
  
  public String getUserName();
  
  // This method updates the cart associated with the customer
  
  public void setCart( CustomerCart newcart );
  
} //Customer