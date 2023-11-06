import java.util.ArrayList;

/**
 * write main method into main class. it has scanner that takes user input
 * use scanner to take inputs. print
 */

public class Programme4ArrayList {
    public static void main(String[] args) {
        Programme4ArrayList t = new Programme4ArrayList();
        t.colourlist();
    }

    public void colourlist() {
        ArrayList<String> colour = new ArrayList();
        colour.add("Black");
        colour.add("Red");
        colour.add("Pink");
        colour.add("Yellow");
        colour.add("Purple");

        for (String colourlist : colour) {
            System.out.println(colourlist);
        }
    }
}
