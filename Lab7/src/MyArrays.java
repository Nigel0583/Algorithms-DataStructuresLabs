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

    public static void mergeSort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        int[] first = new int[a.length / 2];

        int[] second = new int[a.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
        }

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }

    public static void merge(int[] first, int[] second, int[] a) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }

            j++;
        }

        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}

