/**
 * Write programme to compare to arrays
 */


import java.util.ArrayList;

public class Programme11CompareArray {

    public static void main(String[] args) {
            ArrayList<String> c1 = new ArrayList<String>();
            c1.add("Red");
            c1.add("Green");
            c1.add("Black");
            c1.add("White");
            c1.add("Pink");

            ArrayList<String> c2 = new ArrayList<>();
            c2.add("Red");
            c2.add("Green");
            c2.add("Black");
            c2.add("Pink");

            boolean isEqual = c1.equals(c2);

            if(isEqual) {
                System.out.println("ArrayLists c1 and c2 is true ");
            } else {
                System.out.println("ArrayLists c1 and c2 is false");
            }
        }
    }

