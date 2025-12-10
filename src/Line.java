public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        double xdiff = p2.x - p1.x;
        double ydiff = p2.y - p1.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
}

