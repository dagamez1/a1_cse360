package cse360assignment02;
import java.util.*;
/**
 * 
 * @author danie
 *
 */
public class AddingMachine 
{
	/**
	 * This program takes in integers and adds or subtracts from a total. 
	 */
	private int total;
	private int[] input;
	
	public AddingMachine () 
	{
		/**
		 * Creates an object for the class AddingMachine with a total = 0 by default
		 * 
		 */
		
		total = 0; // not needed - included for clarity
		
	}
	AddingMachine machine = new AddingMachine();
	
	
	public int getTotal ()
	{
		
		/**
		 * Return the integer value representing the total in the machine 
		 */
		return total;
	}
	
	public void add (int value)
	{
		/**
		 * This method is used to add the integer value into the total in the machine.
		 * @param value This is the value of the integer being added to the total.
		 */
		total = total + value;
		.toString() = toString() "+ " + value; 
		
		
		
		
	}
	
	public void subtract (int value)
	{
		/**
		 * This method is used to subtract the integer value from the total in the machine.
		 * @param value This is the value of the integer being subtracted from the total.
		 */
		total = total - value;
		toString() = toString + "- " + value;
		
	}
	
	public String toString ()
	{
		/**
		 * This method is used to return a String object representing the value of a number object 
		 */
		
		return "0 ";
	}
	
	public void clear()
	{
		total = 0;
		
		/**
		 * This method is to clear the total in the machine. 
		 */
	}
}
	
	