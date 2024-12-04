import java.util.stream.IntStream;
import java.util.Random;

public class ArrayGenerator {
    private int length;

    public ArrayGenerator(int length) {
        this.length = length;
    }

    public int[] generate() {
        int[] array = new int[length];
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(length * 10))
                .limit(array.length).toArray();
    }

}
