import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers: ");

        int sum = 0;
        int numCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true){
            int input = Integer.valueOf(scanner.nextLine());

            if(input == -1){
                System.out.println("Thanks");
                break;
            }

            if (input%2 == 0 ){
                evenCount++;
            }else {
                oddCount++;
            }

            sum += input;
            numCount ++;

        }

        System.out.println("Your sum: "+sum);
        System.out.println("Number count: " +numCount);
        System.out.println("Avg count: " + (double)sum/numCount);
        System.out.println("Even count: " + evenCount);
        System.out.println("Even count: " + oddCount);


    }
}
//The calculation dividend / divisor is executed first. Since both variables are integers, so is the result.
