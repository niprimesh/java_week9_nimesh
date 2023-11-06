import java.util.HashMap;
import java.util.Map;

/**
 * create hashmap object called people
 * that will store String keys and interger values;
 * and use for each loop to iterate the value from Map.
 */

public class Programme9HashMap {
    public static void main(String[] args) {
        Programme9HashMap t = new Programme9HashMap();//object creation for method calling
        t.hashMapMethod();
    }

    // logical method
    public void hashMapMethod() {
        Map<Integer, String> people = new HashMap();
        people.put(1, "nimesh");
        people.put(2, "nikhil");
        people.put(3, "urveel");
        people.put(4, "mehul");
        people.put(5, "dhara-indu");
        for (Map.Entry<Integer, String> peopleName : people.entrySet()) {
            System.out.println(peopleName);

        }
    }
}
