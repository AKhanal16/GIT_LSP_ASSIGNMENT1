package org.howard.edu.lsp.midterm.question2;

/**
 * The RangeTester class is responsible for testing the methods of the IntegerRange class.
 * It creates instances of IntegerRange and performs various tests on them.
 * 
 * @author [Your Name]
 */
public class RangeTester {

    /**
     * The main method of the RangeTester class.
     * It creates instances of IntegerRange and performs tests on them.
     * 
     * @param args the command-line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        // Create instances of IntegerRange
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(1, 3);

        // Test the contains method of range1
        System.out.println("Range 1 contains 9: " + range1.contains(9));

        // Test the overlaps method of range1 with range2
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2));

        // Test the size method of range1
        System.out.println("Range 1 size: " + range1.size());

        // Test the equals method of range2 with range3
        System.out.println("Range 2 equals Range 3: " + range2.equals(range3));
    }
}
