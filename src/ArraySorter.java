public class ArraySorter {

    public static int[] sortByBuble(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
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

    public static int[] sortByQuick(int[] array) {

        return array;
    }

    public static int[] sortByMerge(int[] array) {

        return array;
    }

}
