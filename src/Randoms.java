import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            class Counts {
                int fromTo() {
                    Random random = new Random();
                    int count = min + random.nextInt(max - min + 1);
                    return count;
                }
            }

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                Counts counts = new Counts();
                int x = counts.fromTo();
                return x;
            }
        };
    }
}
