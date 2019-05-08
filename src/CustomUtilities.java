import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Parallel Computing
 * AUTHORS: R. Lobato , C. Verra , D. Vermaas & W. Beuker
 */
public class CustomUtilities {

    /**
     * Try to shut exit ExecutorService properly
     * @param executorService to shut down
     */
    public static void exitExecutor(ExecutorService executorService) {
        try {
            System.out.println("--------------------------------------");
            System.out.println("Attempting to shut down executor");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Tasks stopped");
        } finally {
            if (!executorService.isTerminated()) {
                System.err.println("Killing none finished tasks");
            }
            executorService.shutdownNow();
            System.out.println("Shutdown complete");
        }
    }
}