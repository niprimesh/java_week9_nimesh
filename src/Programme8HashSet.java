import java.util.HashSet;

/**
 * use hashset that store interger objects. store the number 4,7,and 8 to set.
 * show which imbers are between 1 to 10 are in the set.
 * use for loop and if else
 */
public class Programme8HashSet {

        public static void main(String[] args) {
            Programme8HashSet obj = new Programme8HashSet();
            obj.hashsetMethod();

        }

        public void hashsetMethod() {
            HashSet<Integer> number = new HashSet<>();
            number.add(4);
            number.add(7);
            number.add(8);
            for (int i = 1; i <= 10; i++) {
                if (number.contains(i))
                    System.out.println(i + " number is in list ");
                else
                    System.out.println(i + " number is not in list ");

            }
        }

    }

