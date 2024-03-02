package org.howard.edu.lsp.assignment4;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


/*
 * Abhishek Khanal
 * Large Scale Programming Assignment 4
 * 
 */


/**
 * Represents a set of integers and provides various operations on it.
 */
public class IntegerSet {
	
	// Store the set elements in an ArrayList
	private List<Integer> set = new ArrayList<Integer>();

    /**
     * Constructs an empty IntegerSet.
     */
	public IntegerSet() {
	}
	
    /**
     * Constructs an IntegerSet from an existing ArrayList of integers.
     *
     * @param set An ArrayList of integers representing the initial set.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

    /**
     * Clears the internal representation of the set.
     */
	public void clear() {
		set.clear();
	}
	
    /**
     * Returns the length of the set.
     *
     * @return The number of elements in the set.
     */
	public int length() {
		return set.size();
	} // returns the length
	
    /**
     * Checks if two sets are equal.
     *
     * @param o The object to compare.
     * @return True if the sets contain all the same values regardless of order, false otherwise.
     */
	public boolean equals(Object o) {
		// Check if the object is the same as the current instance
	    if (this == o) {
	        return true;
	    }

	    // Check if the object is null or of a different class
	    if (o == null || getClass() != o.getClass()) {
	        return false;
	    }

	    // Cast the object to IntegerSet
	    IntegerSet otherSet = (IntegerSet) o;

	    // Check if the sizes of the sets are equal
	    if (this.set.size() != otherSet.set.size()) {
	        return false;
	    }

	    // Check if every element in this set is present in the other set
	    for (Integer element : this.set) {
	        if (!otherSet.set.contains(element)) {
	            return false;
	        }
	    }

	    return true;
	} 
	
    /**
     * Checks if the set contains a specified value.
     *
     * @param value The value to check for.
     * @return True if the value is in the set, false otherwise.
     */
	public boolean contains(int value) {
		return set.contains(value);
	}    
	
	public class IntegerSetException extends Exception{
		/**
		 * {@summary constructor to create the integer set exception}
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public IntegerSetException() {
//			print out the exception message
			super("The set is empty");
		}
	}

    /**
     * Returns the largest item in the set.
     *
     * @return The largest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
	public int largest() throws IntegerSetException  {
		if (length() == 0) {
			throw new IntegerSetException();
		}
		int highest = Collections.max(set);
		return highest;
	} 

    /**
     * Returns the smallest item in the set.
     *
     * @return The smallest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
	public int smallest() throws IntegerSetException {
		if (length() == 0) {
			throw new IntegerSetException();
		}
//		set lowest to the minimum value
		int lowest = Collections.min(set);
		return lowest;
	}

    /**
     * Adds an item to the set if it's not already present.
     *
     * @param item The integer to add to the set.
     */
 	public void add(int item) {
        if (!this.set.contains(item)) {
            this.set.add(item);
        }
 	}; // adds item to the set or does nothing if it is in set


	
    /**
     * Removes an item from the set if it exists.
     *
     * @param item The integer to remove from the set.
     */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	} 

    /**
     * Performs the union of this set with another set.
     *
     * @param intSetb The other set to perform union with.
     */
	public void union(IntegerSet intSetb) {
	    for (Integer element : intSetb.set) {
	        if (!set.contains(element)) {
	            set.add(element);
	        }
	    }
	}

    /**
     * Performs the intersection of this set with another set.
     *
     * @param intSetb The other set to perform intersection with.
     */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	} 

    /**
     * Performs the set difference (s1 - s2) between this set and another set.
     *
     * @param intSetb The other set to perform difference with.
     */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
    /**
     * Computes the complement of this set with respect to another set.
     *
     * @param intSetb The set to compute the complement with.
     */
	public void complement(IntegerSet intSetb) {
		intSetb.set.removeAll(this.set);
		this.set.clear();
		this.set.addAll(intSetb.set);
	}
	
    /**
     * Checks if the set is empty.
     *
     * @return True if the set is empty, false otherwise.
     */
	boolean isEmpty() {
		return length() == 0;
	}	
	
    /**
     * Returns the string representation of the set.
     *
     * @return The string representation of the set.
     */
	public String toString() {
		return set.toString();
	}
}
