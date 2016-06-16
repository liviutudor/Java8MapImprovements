import java.util.Map;

/**
 * Created by ltudor on 6/16/16.
 */
public class GetOrDefaultJava8 extends BaseTest {
    public GetOrDefaultJava8(Map<String, String> map, String keyFound, String keyNotFound) {
        super(map, keyFound, keyNotFound);
    }

    @Override
    public void run() {
        String value = map.getOrDefault(keyFound, BaseTest.DEF);
        String valNotFound = map.getOrDefault(keyNotFound, BaseTest.DEF);
        if (valNotFound.equals(value)) System.err.println("Shouldn't happen");
    }
}
