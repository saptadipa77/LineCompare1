public class Line implements Comparable<Line> {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Calculate length of the line
    public double getLength() {
        return Math.sqrt(
                Math.pow(p2.getX() - p1.getX(), 2)
                        + Math.pow(p2.getY() - p1.getY(), 2)
        );
    }

    // Compare two line lengths using compareTo
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }

    // Check equality using equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }
}
