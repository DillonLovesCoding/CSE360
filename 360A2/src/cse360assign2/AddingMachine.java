package cse360assign2;
import java.util.*;

/**
 * @author Dillon Jayanthan
 * Date: 10/9/19
 * CSE360 Wednesday 70642
 * Description: this program adds and subtracts passed values to a variable whilst
 * keeping a history of the order of the modifications called/passed to the variable.
 */

public class AddingMachine {
	
	
	
	Scanner scan = new Scanner(System.in);
	
	/**
	 * below variables are to keep a current record of the total and history of total's
	 * modification.
	 */
	private int total;
	private String history = "0";
	
	public AddingMachine ()
	{
		total = 0;
		// not needed - included for clarity
		
	}
	
	/**
	 * the getTotal function returns the current value of total.
	 * @return total
	 */
	public int getTotal () 
	{
		return total;
		
	}
	
	/**
	 * the add function adds the passed value to the total.
	 * @param value
	 */
	public void add (int value)
	{
		total += value;
		history += " + " + value;
		
	}
	
	/**
	 * the subtract function subtracts the passed value from the total.
	 * @param value
	 */
	public void subtract (int value)
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * the toString function returns the current history of the total variable's modifications.
	 */
	public String toString ()
	{
		return history;
		
	}
	
	/**
	 * the clear function clears the total and it's history and resets both back to 0.
	 */
	public void clear()
	{
		total = 0;
		history = "0";
		
	}
	
	public static void main(String[] args)
	{
		AddingMachine machine = new AddingMachine();
		
		machine.add(1);
		machine.add(5);
		machine.subtract(3);
		System.out.println(machine.getTotal());
		System.out.println(machine.toString());
		machine.clear();
		System.out.println(machine.toString());
	}
	
}
