import java.util.Map;

/**
 * Created by ltudor on 6/16/16.
 */
public abstract class BaseTest implements Runnable {
    public static final String DEF = "default value";

    protected Map<String, String> map;
    protected String keyFound;
    protected String keyNotFound;

    public BaseTest(Map<String, String> map, String keyFound, String keyNotFound) {
        this.map = map;
        this.keyFound = keyFound;
        this.keyNotFound = keyNotFound;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public String getKeyFound() {
        return keyFound;
    }

    public String getKeyNotFound() {
        return keyNotFound;
    }
}
