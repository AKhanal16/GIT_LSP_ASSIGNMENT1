package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

    public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(1, 3);

        System.out.println("Range 1 contains 9: " + range1.contains(9));
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2));
        System.out.println("Range 1 size: " + range1.size());

        System.out.println("Range 2 equals Range 3: " + range2.equals(range3));
    }
}
