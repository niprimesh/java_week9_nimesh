import java.util.ArrayList;

/**
 * Write a java rpogram to test an array list is empty or not.
 * define array list with underground tube names
 */

public class Programme7ArraylistEmpty {
    public static void main(String[] args) {
        arraylistEmpty();
    }
    public static void  arraylistEmpty() {
        ArrayList<String> city = new ArrayList();
        city.add("mumbai");
        city.add("delhi");
        city.add("london");
        city.add("newyork");
        city.add("paris");
        city.add("tokyo");

        if (city.isEmpty()) {
            System.out.println(city.isEmpty());//if empty return
            System.out.println("The arraylist is empty");
        } else {
            System.out.println(city.isEmpty());
            System.out.println("The Arraylist is not empty");
        }
        System.out.println("-----------------------------");
        System.out.println("Arraylist city : \n " + city);
    }
}
