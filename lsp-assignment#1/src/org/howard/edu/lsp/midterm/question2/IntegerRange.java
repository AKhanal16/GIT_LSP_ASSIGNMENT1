package org.howard.edu.lsp.midterm.question2;

/**
 * 
 * @author Abhishek Khanal
 *
 */
public class IntegerRange implements Range {
	
	private int lowerBound;
	private int upperBound;
	
	public IntegerRange() {
	}

	public IntegerRange(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	public void initiatelowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
	
	public void initiateupperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	
	
	/**
	 * Checks whether this range overlaps with another range.
	 * Two ranges overlap if they have at least one common value.
	 * 
	 * @param other the other range to check for overlap
	 * @return true if the ranges overlap, false otherwise
	 */
	@Override
	public boolean overlaps(Range other) {
		return (other.contains(lowerBound) || other.contains(upperBound) || other.overlaps(this));
	}
	
	
	/**
	 * Calculates the number of integers in the range.
	 * 
	 * @return the number of integers in the range
	 */
	@Override
	public int size() {
		return this.upperBound - this.lowerBound + 1;
	}
	
	/**
	 * Checks whether the range contains a specific value.
	 * 
	 * @param value the value to check for containment
	 * @return true if the range contains the value, false otherwise
	 */
	@Override
	public boolean contains(int value) {
		if (value >= this.lowerBound && value <= this.upperBound) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if another range is equal to this range.
	 * Two ranges are considered equal if they have the same lower and upper bounds.
	 * 
	 * @param other the other range to compare
	 * @return true if the ranges are equal, false otherwise
	 */
	public boolean equals(Range other) {
		if (other.contains(this.lowerBound) && other.contains(this.upperBound) && other.size() == this.size()) {
			return true;
		} else {
			return false;
		}
	}
}