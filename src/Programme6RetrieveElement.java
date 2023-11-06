import java.util.ArrayList;

/**
 * write java program to retrieve an element  from specific index from giver array list
 */


public class Programme6RetrieveElement {

    public static void main(String[] args) {
        Programme6RetrieveElement t = new Programme6RetrieveElement();// object creation to call method
        t.retrieveElement();
    }

    //logical method creation named retrieveElement
    public void retrieveElement() {
        ArrayList<String> days = new ArrayList();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println("original days are:\n" + days);
        System.out.println("==============================");

        String element = days.get(1);// retrieve second element
        System.out.println("Second element :" + element);

        element = days.get(4);//retrieve fifth element
        System.out.println("Fifth element :" + element);
    }
}
