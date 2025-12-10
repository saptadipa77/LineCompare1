public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        Point p1 = new Point(2, 4);
        Point p2 = new Point(6, 8);

        Point p3 = new Point(1, 1);
        Point p4 = new Point(4, 5);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 2 Length: " + line2.getLength());
    }
}
