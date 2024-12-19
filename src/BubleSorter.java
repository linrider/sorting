public class BubleSorter {

    public static void sort(int[] array) {
        boolean isSwapped = true;
        int i = 0;

        while (isSwapped) {
            isSwapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSwapped = true;
                }    
            }
            i++;
        }
    }
}
