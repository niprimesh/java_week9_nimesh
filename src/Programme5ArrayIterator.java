import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * write a java program to iterate through all elements in an array list using iterator
 */
public class Programme5ArrayIterator {
    public static void main(String[] args) {
        Programme5ArrayIterator t = new Programme5ArrayIterator();// object creation for method calling
        t.arraymethod();

    }

    //method for logical part
    public void arraymethod() {
        Set<Integer> list = new HashSet();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
