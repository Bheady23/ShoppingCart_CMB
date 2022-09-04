import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Application class to test the methods of Shopping Cart class. 
 * Objects for the shopping cart are created using Item class. 
 * @author Chris Burkhead
 * @version 1.0
 * Assignment 1.1
 * CS215ON
 * Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		
		//creating items for the shopping cart
		Item item1= new Item("potatoes", 399);
		Item item2= new Item("Mop", 999);
		Item item3= new Item("Cat food", 1000);
		Item item4= new Item("Sour Cream", 200);
		Item item5= new Item("Bag Salad", 200);
		Item item6= new Item("Tortilla Chips", 300);
		Item item7= new Item("Bread", 200);
		Item item8= new Item("Peanut Butter", 100);
		Item item9= new Item("Salsa", 400);
		Item item10= new Item("Frozen Pizza", 699);
		
		//instantiating the shoppingCart bag
		ShoppingCart shoppingCart1 = new ShoppingCart();
		
		//checking to see if the shopping cart is empty
		System.out.println("Is the shopping cart empty: " +shoppingCart1.isEmpty());
		System.out.println();
		
		//filling the shopping cart with items
		shoppingCart1.add(item1);
		shoppingCart1.add(item2);
		shoppingCart1.add(item2);
		shoppingCart1.add(item3);
		shoppingCart1.add(item4);
		shoppingCart1.add(item5);
		shoppingCart1.add(item6);
		shoppingCart1.add(item7);
		shoppingCart1.add(item8);
		shoppingCart1.add(item9);
		shoppingCart1.add(item10);
		
		
		//checking to see that the items have been added to the shopping cart
		System.out.println("Is the shopping cart empty: "+ shoppingCart1.isEmpty());
		System.out.println();
		
		//Creating and then printing an array of the shopping cart to demonstrate that the items have been entered
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		System.out.println();
		
		//Checking to see how many items are in the shopping cart
		System.out.println("How many items are in the shopping cart: "+shoppingCart1.getCurrentSize());
		System.out.println();
		
		//removing an item from the shopping cart
		System.out.println(shoppingCart1.remove()+" was removed from the shopping cart");
		System.out.println();
		
		//reprinting the array to check that the item has been removed 
		//Double checking by also getting the size of the cart
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		System.out.println();
		System.out.println("How many items are in the shopping cart: "+shoppingCart1.getCurrentSize());
		System.out.println();
		
		//removing a specific item from the cart
		System.out.println("Was "+item6+ " removed from the shopping cart: "+shoppingCart1.remove(item6));
		System.out.println();
		
		
		//reprinting the array to check that the item has been removed 
		//Double checking by also getting the size of the cart
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		System.out.println();
		System.out.println("How many items are in the shopping cart: "+shoppingCart1.getCurrentSize());
		System.out.println();
		
		//checking the shopping cart to see how many times a specific item is in the cart
		System.out.println("How many times does "+item2+" appear in the shopping cart: "+shoppingCart1.getFrequency(item2));
		System.out.println();
		
		//checking the shopping cart to see if it contains a specific item
		System.out.println("Does the shopping cart contain "+item3+": "+shoppingCart1.contains(item3));
		System.out.println();
		
		//calculating the sum of all the costs of the items in the shopping cart 
		System.out.println("What is total of all the items in the shopping cart: $"+shoppingCart1.getCartPrice());
		System.out.println();
		
		//calculating the total of the shopping cart including tax and shipping fees
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("What is the total of the all the items in the shopping cart with tax and shipping: $"+df.format(shoppingCart1.getCartTotal()));
		System.out.println();
		
		//clearing the shopping cart of all items, then reprinting the Array to show it is empty
		shoppingCart1.clear();
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		//adding items to the cart then printing array to show they were added
		shoppingCart1.add(item5);
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.add(item6);
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.add(item7);
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.add(item8);
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.add(item9);
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		//removing items from the shopping cart and printing array to show they were removed
		shoppingCart1.remove();
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.remove();
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.remove();
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.remove();
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		shoppingCart1.remove();
		System.out.println(Arrays.toString(shoppingCart1.toArray()));
		
		}//end main
	
}//end class