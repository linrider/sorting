import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args) throws Exception {
        ArrayGenerator arrayGenerator = new ArrayGenerator(100);
        int[] array = arrayGenerator.generate();
        ArraySorter.bubleSort(array);
        Arrays.stream(array).forEach(el -> System.out.print(el + ", "));
    }
}
