import java.util.Iterator;
import java.util.Random;

public class RIterator implements Iterator<Integer> {
    private Random random;
    private Integer min;
    private Integer max;
    private int result;//по сути не требуется, в прямом ключе вроде как использоваться не будет, но так видна суть

    public RIterator(Integer min, Integer max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public boolean hasNext() {
        //тк интератор по условию задания бесконечный, то всегда есть следующее
        return true;
    }

    @Override
    public Integer next() {
        //по условию задания всегда возвращаем рандомное значение в заданном интервале
        return result = random.nextInt(max - min + 1) + min;
    }
}
