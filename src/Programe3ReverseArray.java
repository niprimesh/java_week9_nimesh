public class Programe3ReverseArray {

    public static void main(String[] args) {

        Programe3ReverseArray obj = new Programe3ReverseArray();
        obj.reverseArray();

    }

    public void reverseArray() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array : ");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n------------------------------");

        System.out.println("Array in reverse order : ");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");


    }
}