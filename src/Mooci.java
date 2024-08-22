import java.util.Scanner;

public class Mooci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        String myname = scanner.nextLine();
        System.out.println("Name: "+myname);
        System.out.println("Name: "+scanner.nextLine());

        String valueAsString = "42";
        int value = Integer.valueOf(valueAsString);
        System.out.println(value);
       //The Integer.valueOf command converts a string to an integer.
        // It takes the string containing the value to be converted as a parameter.

        System.out.println("Write a value ");
        double valueDouble = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + valueDouble);

        int first = 3;
        int second = 2;
        double result1 = (double) first / second;
        System.out.println(result1); // prints 1.5
        // An integer can be converted into a floating point number by placing a type-casting operation (double) before it:

        int dividend = 3;
        int divisor = 2;
        double result = dividend / divisor * 1.0;
        System.out.println(result);

        

    }
}
