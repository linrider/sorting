public class ArraySorter {

    public static int[] bubleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static int[] quickSort(int[] array) {

        return array;
    }

    public static int[] mergeSort(int[] array) {

        return array;
    }

}
