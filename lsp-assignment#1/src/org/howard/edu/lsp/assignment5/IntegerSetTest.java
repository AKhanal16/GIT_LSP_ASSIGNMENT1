package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/** 
 * Abhishek Khanal
 * @author Abhishek
 * **/

/**
 * {@summary Responsible for the implementation of test cases of the IntegerSet}
 * Class IntegerSet
 * @author Abhishek Khanal
 */
public class IntegerSetTest {
	IntegerSet s1;
	IntegerSet s2;
	
	/**
	 * {@summary a method to set up the variables for test cases}
	 * @throws Exception
	 * @return void
	 */
	@Before
	public void setUp() throws Exception {
		s1 = new IntegerSet();
		s2 = new IntegerSet();
	}
	
	/**
	 * {@summary a method to reset the variables for test cases}
	 * @throws Exception
	 * @return void
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * {@summary a method to check the clear method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		s1.add(1);
		s1.add(2);
		
		s1.clear();
		
		IntegerSet s3 = new IntegerSet();
		
		assertTrue(" S1 when cleared looks like this ", s1.equals(s2));
		
		
		s2.clear();
		assertTrue(" Clearing of the empty set gives ", s2.equals(s3));
	}
	
	/**
	 * {@summary a method to test for the length method of IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for length of Sets")
	public void testLength() {
		assertEquals(" Length of s1 is ", s1.length(), 0);
		
		s1.add(50);
		s1.add(51);
		s1.add(52);
		
		assertEquals(" The length of s1 now is ", s1.length(), 3);
	}
	
	/**
	 * {@summary a method that checks the equals method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for equals of Sets")
	public void testEquals() {
		s1.add(0);
		s1.add(1);
		
		assertFalse("Non empty set s1 should not equal to the empty set s2, so it should be False", s1.equals(s2));
		
		s2.add(0);
		s2.add(1);
		
		assertTrue("Non empty set s1 should equal to the empty set s2, so it should be True", s1.equals(s2));
	}
	
	/**
	 * {@summary method that checks the contains method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		s1.add(100);
		s1.add(102);
		
		assertTrue(" 101 is present in s1 which is True", s1.contains(100));
		assertFalse(" 102 is present in s1 which is False", s1.contains(1));
	}

	/**
	 * {@summary a method that checks the smallest value of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		s1.add(1);
		s1.add(2);
		s1.add(3);
		assertEquals(" Smallest value in s1 is ", 1, s1.smallest());
		
		assertThrows("Raises exception for the case of empty set", IntegerSetException.class ,
				() -> {
					s2.smallest();
				}
				);
	}
	
	/**
	 * {@summary a method that checks the largest value of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test for largest method")
	public void testLargest() throws IntegerSetException {
		s1.add(0);
		s1.add(2);
		s1.add(3);
		assertEquals("the largest value in the s3 is 3", 3, s1.largest());
		
		assertThrows("Raises exception for the case of largest set", IntegerSetException.class ,
				() -> {
					s2.largest();
				}
				);
	}
	
	/**
	 * {@summary a method that checks the add method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test for add method")
	public void testAdd() {
		s1.add(10);
		
		assertEquals(" The set should be [10]", s1.toString(), "[10]");
		
		s2.add(20);
		assertEquals(" The set should be [20]", s2.toString(), "[20]");
	}
	
	/**
	 * {@summary a method that checks the remove method }
	 * @return void
	 */
	@Test
	@DisplayName("Test for remove method")
	public void testRemove() {
		s1.add(1);
		s1.add(2);
		
		s2.add(1);
		
		s1.remove(2);
		
		assertTrue(" Set should be [1]", s2.equals(s1));
		
		IntegerSet s3 = new IntegerSet();
		
		s2.remove(1);
		
		assertTrue(" It should be empty set []", s2.equals(s3));
	}
	
	/**
	 * {@summary a method to check the Union method }
	 * @return void
	 */
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		s1.clear();
		s1.add(5);
		
		s2.add(7);
		
		s1.union(s2);
		
		IntegerSet s3 = new IntegerSet();
		
		s3.add(5);
		s3.add(7);
		
		assertTrue(" The union should be [5, 7]", s1.equals(s3));
		
	}
	
	/**
	 * {@summary a method that checks the intersect method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for intersect method")
	public void testIntersect() {
		s1.add(1);
		s1.add(2);
		
		s2.add(1);
		
		IntegerSet s3 = new IntegerSet();
		s3.add(1);
		
		s1.intersect(s2);
		
		assertTrue("the intersection of s1 and s2 is [1]", s1.equals(s3));

		
	}
	
	/**
	 * {@summary a method that checks the diff method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for diff")
	public void testdiff() {
		s1.add(1);
		s1.add(2);
		
		s2.add(1);
		
		s1.diff(s2);
		
		IntegerSet s3 = new IntegerSet();
		s3.add(2);
		
		assertTrue("the diff of [1,2] - [1] should get us [2]",s1.equals(s3));
		
	}
	
	
	/**
	 * {@summary a method that checks the complement method}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for diff")
	public void testcomplement() {
		s1.add(1);
		s1.add(2);
		
		s2.add(1);
		
		s2.complement(s1);
		
		IntegerSet s3 = new IntegerSet();
		s3.add(2);
		
		assertTrue("the complement of s2 on s1 should result [2]", s1.equals(s3));
		
	}
	
	/**
	 * {@summary a method that checks the isEmpty method}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for isEmpty")
	public void testisEmpty() {
		s1.clear();
		assertTrue("result of isEmpty for the s1 with value [] should be True", s1.isEmpty());
		
		s1.add(1);
		
		assertFalse("result of isEmpty for the s1 with value [1] should be False", s1.isEmpty());
	}
	
	/**
	 * {@summary a method that checks the toString method}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for toString")
	public void testtoString() {
		assertEquals("toString for empty set gives '[]' ", "[]", s1.toString());
		s1.add(10);
		assertEquals("10 added to s1 should give '[10]' ", "[10]", s1.toString());
		
		s2.add(20);
		assertEquals("20 added to s2 should give '[20]' " , "[20]", s2.toString());
		
	}

}