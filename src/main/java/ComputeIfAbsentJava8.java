import java.util.Map;

/**
 * Created by ltudor on 6/16/16.
 */
public class ComputeIfAbsentJava8 extends BaseTest {
    public ComputeIfAbsentJava8(Map<String, String> map, String keyFound, String keyNotFound) {
        super(map, keyFound, keyNotFound);
    }

    @Override
    public void run() {

        String value = map.computeIfAbsent(keyFound, this::getValueForNotFound);
        String valNotFound = map.computeIfAbsent(keyNotFound, this::getValueForNotFound);
        if (valNotFound.equals(value)) System.err.println("Shouldn't happen");
    }

    String getValueForNotFound(String key) {
        return key + " / " + BaseTest.DEF;
    }
}
