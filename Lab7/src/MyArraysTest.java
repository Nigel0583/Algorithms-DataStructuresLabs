public class MyArraysTest {
    public static void main(String[] args) {
        /*
        int[] nums = {2,56, 9, 11, 39};

        MyArrays.insertionSort(nums);

        System.out.println(MyArrays.binarySearch(nums, 2));//
        */
        int[] numbers = {2, 56, 9, 11, 39, 78, 4, 33, 90};

        MyArrays.mergeSort((numbers));
        for (int i : numbers) {
            System.out.print(i + ", ");
        }


        int[] nums = new int[19990989];

        long startTime = System.currentTimeMillis();
        MyArrays.mergeSort(nums);
        long endTime = System.currentTimeMillis();

        System.out.println("\nMy mergeSort: " + (endTime - startTime));
    }
}
