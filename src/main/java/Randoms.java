import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected RIterator rIterator; //выполнять будем через класс, реализующий Iterator<Integer>

    public Randoms(int min, int max) {
        rIterator = new RIterator(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return rIterator;
    }
}
