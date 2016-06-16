import java.util.Map;

/**
 * Created by ltudor on 6/16/16.
 */
public class ComputeIfPresentJava8 extends BaseTest {
    public ComputeIfPresentJava8(Map<String, String> map, String keyFound, String keyNotFound) {
        super(map, keyFound, keyNotFound);
    }

    @Override
    public void run() {
        String value = map.computeIfPresent(keyFound, this::getUppercase);
        String valNotFound = map.computeIfPresent(keyNotFound, this::getUppercase);
        if (value.equals(valNotFound)) System.err.println("Shouldn't happen");
    }

    String getUppercase(String key, String value) {
        return value.toUpperCase();
    }
}
