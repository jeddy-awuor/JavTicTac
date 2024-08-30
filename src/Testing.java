import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
       printChristmasTree(9);
    }
    public static void printStars(int number) {
        System.out.print("*");
        for (int i = 1; i<number;i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    public static void printSquare(int size){
        int i = 1;
        while (i <= size){
            printStars(size);
            i++;
        }
    }
    public static void printRectangle(int width, int height){
        int i = 1;
        while (i<= height){
            printStars(width);
            i++;
        }
    }
    public static void printTriangle(int size){
        int i  = 1;
        int z  = size - 1;
        while (i <= size){
            while(z >= 0){
                printSpaces(z);
                z--;
                printStars(i);
                i++;
            }
        }

    }
    public static void printSpaces(int size){
        int i = 1;
        while (i<= size){
            System.out.print(" ");
            i++;
        }
    }
    public static void printBase(int starterSpace){
        int i = 1;
        int height = 2;
        int startingSpaces = starterSpace;

        while (i<=height){
            printSpaces(startingSpaces);
           printStars(3);
           i++;
        }
    }
    public static void printChristmasTree(int height) {
        int i = 1;
        int z = 1;
        int base = 1;
        int spaces = height - 1;
        while (i<= height){
            while (spaces >= 0){
                printSpaces(spaces);
                spaces--;
                printStars(z);
                z= z+2;
                i++;
            }
        }
        printBase(((z-2)/2) - 1);

    }

}

//The calculation dividend / divisor is executed first. Since both variables are integers, so is the result.
