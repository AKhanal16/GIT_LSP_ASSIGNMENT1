package org.howard.edu.lsp.assignment4;
import org.howard.edu.lsp.assignment4.IntegerSet;

/*
 * Abhishek Khanal
 * Large Scale Programming Assignment 4
 * 
 */


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is:" + set1.toString());
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
			System.out.println("Largest value in Set1 is: " + set1.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Set is empty");
		}
		System.out.println();
		
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		
		// Test for clear()
		System.out.println("*******************************************");
		System.out.println("Clear method");
		System.out.println("Value of Set2 before clearing is: " + set2.toString());
		set2.clear();
		System.out.println("Value of set2 after the clearing is: " + set2.toString());
		System.out.println();
		
		
		// Test for length()
		System.out.println("*******************************************");
		System.out.println("Length method");
		System.out.println("Length of the sets");
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Length of Set 1 is: "+ set1.length());
		System.out.println("Value of set2 is: " + set2.toString());
		System.out.println("Length of Set 2 is: "+ set2.length());
		System.out.println();
		
		
		// Test for equals()
		System.out.println("*******************************************");
		System.out.println("Equals method");
		System.out.println("Check if set1 is equal to set 2");
		System.out.println("Value of set1 is : " + set1.toString());
		System.out.println("Value of set2 is : " + set2.toString());
		System.out.println("Result is : " + set1.equals(set2));
		System.out.println();
		
		
		// Test for contains()
		System.out.println("*******************************************");
		System.out.println("Contains method");
		System.out.println("To check if Set1 contains certain elements or not");
		System.out.println("The value of set1 is: " + set1.toString());
		System.out.println("Set 1 contains 5: "+ set1.contains(5));
		System.out.println("Set 1 contains 2: "+ set1.contains(2));
		System.out.println();

		
		// Test for smallest() and largest()
		System.out.println("*******************************************");
		System.out.println("Smallest Method and Largest Method");
		System.out.println("Value of set1 is : " + set1.toString());
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
			System.out.println("Largest value in Set1 is: " + set1.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Set is empty");
		}
		System.out.println("Value of set2 is : " + set2.toString());
		try {
			System.out.println("Smallest value in Set2 is: " + set2.smallest());
			System.out.println("Largest value in Set2 is: " + set2.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Set is empty");
		}
		System.out.println();
		
		
		// Test for the add()
		System.out.println("*******************************************");
		System.out.println("Add method");
		System.out.println("The value of set2 before adding element is: " + set2.toString());
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("The value of set2 after adding element is: " + set2.toString());
		
		
		
		IntegerSet set3 = new IntegerSet();
		System.out.println("The value of set3 before adding element is: " + set3.toString());
		set3.add(15);
		set3.add(3);
		set3.add(4);
		System.out.println("The value of set3 after adding element is: " + set3.toString());
		System.out.println();

		
		// Test for the remove()
		System.out.println("*******************************************");
		System.out.println("Remove method");
		System.out.println("Remove the value of 15 from set 3");
		System.out.println("Value of Set3 before removal of 15 is: " + set3.toString());
		set3.remove(15);
		System.out.println("Value of set3 after the removal is: " + set3.toString());
		System.out.println();
		
		
		// Test for the union()
		System.out.println("*******************************************");
		System.out.println("Union method");
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2");
		System.out.println(set1.toString());
		System.out.println();
		
		
		// Test for the intersect()
		System.out.println("*******************************************");
		System.out.println("Intersect method");
		set2.add(1);
		set2.add(6);
		set2.add(10);
		System.out.println("Intersect of Set2 and Set3");
		System.out.println("Value of Set2 is:" + set2.toString());
		System.out.println("Value of Set3 is:" + set3.toString());
		set2.intersect(set3);
		System.out.println("Result of intersect of Set2 and Set3");
		System.out.println(set2.toString());
		System.out.println();
		
		
		// Test for the difference()
		System.out.println("*******************************************");
		System.out.println("Difference method");
		set2.add(19);
		set2.add(25);
		set2.add(45);
		System.out.println("Difference of the sets Set2 - set3");
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		set2.diff(set3);
		System.out.println("Result: " + set2.toString());
		System.out.println();
		
		
		// Test for the complement()
		System.out.println("*******************************************");
		System.out.println("Complement method");
		System.out.println("Complement of the sets Set2 with respect to set3");
		set3.add(19);
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		set2.complement(set3);
		System.out.println("Result: " + set2.toString());
		System.out.println();
		
		
		// Test for the isEmpty()
		System.out.println("*******************************************");
		System.out.println("IsEmpty method");
		System.out.println("To check if the set is empty or not");
		System.out.println("The value of set2 is: " + set2.toString());
		System.out.println("The result is: " + set2.isEmpty());
		set2.clear();
		System.out.println("The value of set2 is: " + set2.toString());
		System.out.println("The result is: " + set2.isEmpty());
		System.out.println();
		
		
		// Test the toString()
		System.out.println("*******************************************");
		System.out.println("ToString method");
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println();
		
		
		System.out.println("************** THE END **********************");
	}	
}
