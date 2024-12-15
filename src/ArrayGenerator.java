import java.util.stream.IntStream;
import java.util.Random;

public class ArrayGenerator {
    private int length;
    private int max;

    public ArrayGenerator(int length, int max) {
        this.length = length;
        this.max = max;
    }

    public int[] generate() {
        int[] array = new int[length];
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(max))
                .limit(array.length).toArray();
    }

}
