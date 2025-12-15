public class Main {

    public static void main(String[] args) {

        System.out.println("=== UC4: Line Comparison using OOP, equals(), compareTo() ===");

        Point a1 = new Point(2, 3);
        Point a2 = new Point(6, 7);

        Point b1 = new Point(1, 1);
        Point b2 = new Point(5, 5);

        Line line1 = new Line(a1, a2);
        Line line2 = new Line(b1, b2);

        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());

        // Using equals()
        if (line1.equals(line2)) {
            System.out.println("Line 1 and Line 2 are EQUAL.");
        } else {
            System.out.println("Line 1 and Line 2 are NOT equal.");
        }

        // Using compareTo()
        int result = line1.compareTo(line2);

        if (result > 0) {
            System.out.println("Line 1 is GREATER than Line 2.");
        } else if (result < 0) {
            System.out.println("Line 1 is SMALLER than Line 2.");
        } else {
            System.out.println("Both lines are EQUAL in length.");
        }
    }
}
