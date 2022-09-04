
import java.util.Arrays;
/**
 * This class represents a Shopping cart, it utilizes the ResizableArrayBag methods to add, remove, calculate the total 
 * and do several other functions as you would with a shopping cart.  
 * @author Chris Burkhead
 * @version 1.0
 * Assignment 1.1
 * CS215ON
 * Fall 2022
 * @param <resizableArrayBag>
 */

public class ShoppingCart {
	
	//Initializing the ResizableArrayBag and setting instance variables
	ResizableArrayBag<Item> resizableArrayBag = new ResizableArrayBag<>(25);
	double cartPrice=0;
	
	
	public ShoppingCart() {
		
	}//end preferred constructor
	
	/**
	 * Checks to see if the Shopping cart is Empty
	 * @return if the bag is Empty(true) or not (false)
	 */
	public boolean isEmpty() {
		return resizableArrayBag.isEmpty();
	}//end isEmpty
	
	/**
	 * Adds an Object to the shopping cart
	 * @param Object
	 * @return false if the item cannot be added, otherwise the item is added
	 */
	public boolean add(Item Object) {
		return resizableArrayBag.add(Object);
	}//end add
	
	/**
	 * Removes a random object from the shopping cart
	 * @return the removed item
	 */
	public Object remove() {
		return resizableArrayBag.remove();
	}//end remove
	
	/**
	 * Removes a specific object T from the shopping cart
	 * @param T
	 * @return the removed object
	 */
	public Object remove(Object Item) {
		return resizableArrayBag.remove((Item) Item);
	}//end remove(Item)
	
	/**
	 * Gets the total amount of objects in the shopping cart 
	 * @return an int of how many objects are in the shopping cart
	 */
	public int getCurrentSize() {
		return resizableArrayBag.getCurrentSize();
	}//end getCurrentSize
	
	/**
	 * Checks to see how many times an object is in the shopping cart
	 * @param T
	 * @return an int of how many times that item is in the shopping cart
	 */
	public int getFrequency(Item Object) {
		return resizableArrayBag.getFrequencyOf(Object);
	}//end getFrequencyOf
	
	/**
	 * checks to see if the shopping cart contains a specific object
	 * @param Object
	 * @return true if the object is in the shopping cart otherwise false
	 */
	public boolean contains(Item Object) {
		return resizableArrayBag.contains(Object);
	}//end contains 
	
	/**
	 * Creates an array of all the objects in the cart
	 * @return an array
	 */
	public Object[] toArray() {
		return resizableArrayBag.toArray();
	}//end toArray
	
	/**
	 * Determines the total cost of all of the items in the cart
	 * @return a double of the total cost
	 */
	public double getCartPrice() {
		resizableArrayBag.toArray();
		Object[] Cart =resizableArrayBag.toArray();
		for (int i=0; i<Cart.length;i++) {
		Item product=(Item) Cart[i];	
		int price=((Item) product).getPrice();
		cartPrice=(cartPrice+price);
		}
		cartPrice=cartPrice*.01;
		return cartPrice;
	}//end getCartPrice

	/**
	 * Determines the full total of the shopping cart with 6% sales tax and a flat shipping fee of $5.99 added
	 * @return a double of the full cost of the Cart 
	 */
	public double getCartTotal() {
		double salesTax=cartPrice*.06;
		double shipping=5.99;
		cartPrice=cartPrice+salesTax;
		double cartTotal=cartPrice+shipping;
		return cartTotal;
	}//end getCartTotal
	
	/**
	 * clears the shopping cart of all objects
	 */
	public void clear() {
		resizableArrayBag.clear();
	}//end clear



	@Override
	public String toString() {
		return "isEmpty()=" + isEmpty() + ", remove()="
				+ remove() + ", getCurrentSize()=" + getCurrentSize() + ", toArray()=" + Arrays.toString(toArray())
				+ ", getCartPrice()=" + getCartPrice() + "]";
	}//end to string

}//end class