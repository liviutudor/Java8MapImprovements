import java.util.HashMap;
import java.util.Map;

/**
 * Runs the tests.
 *
 * @author ltudor
 */
public class DriverApp {
    /* How many times to run each operation and average the results. */
    static int N_TIMES = 100;

    public static void main(String[] args) {
        String keyFound = "one";
        String keyNotFound = "two";
        Map<String, String> map = new HashMap<>();
        map.put(keyFound, "a random value");

        runTest(new GetOrDefaultPreJava8(map, keyFound, keyNotFound), "Pre-Java8 getOrDefault");
        runTest(new GetOrDefaultJava8(map, keyFound, keyNotFound), "Java8 getOrDefault");

        runTest(new ComputeIfAbsentPreJava8(map, keyFound, keyNotFound), "Pre-Java8 computeIfAbsent");
        runTest(new ComputeIfAbsentJava8(map, keyFound, keyNotFound), "Java8 computeIfAbsent");

        runTest(new ComputeIfPresentPreJava8(map, keyFound, keyNotFound), "Pre-Java8 computeIfPresent");
        runTest(new ComputeIfPresentJava8(map, keyFound, keyNotFound), "Java8 computeIfPresent");
    }

    static void runTest(Runnable r, String name) {
        System.out.println();
        System.out.println();
        System.out.println(name);
        long start, end;
        for (int i = 0; i < N_TIMES; i++) {
            start = System.nanoTime();
            r.run();
            end = System.nanoTime();
            System.out.println(end - start);
        }
    }
}
