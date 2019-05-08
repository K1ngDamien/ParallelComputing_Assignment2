import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bucketsort {

    public static void main(String[] args) throws Exception {
        int maxVal=5;
        int [] data= {5,3,0,2,4,1,0,5,2,3,1,4};

        System.out.println("BUCKET SORT");
        System.out.println("Before sorting: " + Arrays.toString(data));
        sort(data,maxVal);
        System.out.println("After sorting:  " + Arrays.toString(data));
        System.out.println(System.nanoTime());

        // Create pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

// Create tasks
        Callable<Long> task1 = () ->
                System.nanoTime();
        Callable<Long> task2 = () ->
                System.nanoTime();
        Callable<Long> task3 = () ->
                System.nanoTime();

// Submit tasks
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

// Get results
        long result1 = task1.call();
        long result2 = task2.call();
        long result3 = task3.call();
    }

    public static void sort(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }



}
