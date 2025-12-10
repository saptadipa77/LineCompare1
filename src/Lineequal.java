public class Lineequal {

    public boolean areEqual(Line l1, Line l2) {
        return Double.compare(l1.getLength(), l2.getLength()) == 0;
    }
}

