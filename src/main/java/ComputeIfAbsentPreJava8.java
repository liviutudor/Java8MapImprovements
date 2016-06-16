import java.util.Map;

/**
 * Created by ltudor on 6/16/16.
 */
public class ComputeIfAbsentPreJava8 extends BaseTest {
    public ComputeIfAbsentPreJava8(Map<String, String> map, String keyFound, String keyNotFound) {
        super(map, keyFound, keyNotFound);
    }

    @Override
    public void run() {
        String value = getValue(keyFound);
        String valNotFound = getValue(keyNotFound);
        if (valNotFound.equals(value)) System.err.println("Shouldn't happen");
    }

    String getValue(String key) {
        String value = map.get(key);
        if (value == null) {
            value = key + " / " + BaseTest.DEF;
        }
        return value;
    }
}
