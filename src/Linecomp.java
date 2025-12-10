public class Linecomp{

    public int compareLines(Line l1, Line l2) {
        return Double.compare(l1.getLength(), l2.getLength());
    }
}

