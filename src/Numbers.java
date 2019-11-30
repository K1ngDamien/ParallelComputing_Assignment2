import java.util.concurrent.ThreadLocalRandom;

/**
 * Parallel Computing
 * AUTHORS: D. Vermaas & W. Beuker
 */

public class Numbers {

    public static int[] ArrayGenerator(){
        int[] data = new int[50000];
        for (int i = 0; i < data.length; i++) {
            data[i] += ThreadLocalRandom.current().nextInt(1,10000 + 1 );
        }
        return data;
    }



}
