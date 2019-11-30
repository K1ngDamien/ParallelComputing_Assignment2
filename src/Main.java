import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/**
 * Parallel Computing
 * AUTHORS: R. Lobato , C. Verra , D. Vermaas & W. Beuker
 */

public final class Main {

    private static final int RUNS = 6;
    private static int ARRAY_LENGTH = 1024000;
    private static int TEST_ARRAY[] = Numbers.ArrayGenerator();


    public static void main(final String... args) {


        // START- BucketSort
		System.out.println("---- BucketSort ----");
		System.out.println("Before: " + Arrays.toString(Numbers.ArrayGenerator()));
		BucketSort.sort(TEST_ARRAY);

		printArray(TEST_ARRAY);

		System.out.println("Is Sorted: " + sortingCheck(TEST_ARRAY));
        // END- BucketSort

        // START- algorithm
        // Code..
        // END- algorithm
    }

    private static void printArray(int[] testArray) {
    }

    private static boolean sortingCheck(int[] array)
    {
        for ( int i = 0; i < array.length - 1 ; i++ ) {
            if ( array[i] > array[i+1] )
                return false;
        }
        return true;
    }

}