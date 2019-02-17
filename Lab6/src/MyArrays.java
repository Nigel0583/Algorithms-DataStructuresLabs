public class MyArrays {
    public static void insertionSort(int[] a) {
        for (int index = 1; index < a.length; index++) {
            int val = a[index];
            int j = index - 1;

            while (j >= 0 && a[j] > val) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = 1;
        }
    }

    public static int binarySearch(int[] a, int val) {
        boolean found = false;
        int left = 0;
        int right = a.length;
        int middle = right / 2;


        while (!found && left <= right) {
            if (a[middle] == val) {
                found = true;
            } else {
                if (a[middle] > val) {
                    right = middle - 1;
                    middle = right / 2;
                } else {
                    left = middle + 1;
                    middle = (right + left) / 2;
                }
            }
        }
        if (found) {
            return middle;
        } else {
            return -1;
        }
    }
}

