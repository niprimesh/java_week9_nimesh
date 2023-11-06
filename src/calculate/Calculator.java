package calculate;

public class Calculator {
    public void addtion(int a, int b) {
        int result = a + b;
        System.out.println(" Addition of " +a+ " and "+ b+ "is : " +result);
    }
    public void subtraction (int a , int b){
        int result1 = a -b;
        System.out.println("Subtraction of " + a + " and " + b + " is : " + result1);
    }
    public void division ( int a, int b){
        int result2= a/b;
        System.out.println("Division of " + a + " and " + b + " is : " + result2);
    }
    public void multiplication ( int a , int b){
        int result3 = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is : " + result3);
    }
    public void calculateResult(int a, int b, char symbol){
        if (symbol =='+'){
            int result = a +b;
        } else if (symbol =='-'){
            int result1 = a -b;
        } else if ( symbol =='*'){
            int result3 = a*b;
        } else if ( symbol =='/'){
            int result2 = a/b;
        } else {
            System.out.println("symbol is incorrect");
        }
    }
}
