public class Main {
    public static void main(String[] args) {
        int age = 20;
        float myfloat = 23.0f;

        //widening casting
        int myint = 27;
        double myd = myint;
        //narrowing casting
        double mydouble = 29.0f;
        int narrowit = (int) mydouble;

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate changing userscore to float
    the program automaically makes maxscore a float*/

        float percentage = (float) userScore / maxScore * 100.0f;
        // Print the result
        System.out.println("User's percentage is " + percentage);

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        //concatenate without fname+" "+ lname
        String firstname = "Jeddy";
        String lastname = "Awuor";
        System.out.println(firstname.concat(lastname));

        int myran = (int) (Math.random()*3) + 1;
        System.out.println(myran);
        //short hand ifelse
        int myagee = 20;
        String result = (age>18) ? "Adult" : "Not adult";
        System.out.println("You are a " +result);

        String[] cars = {"red", "Green","Yellow"};
        System.out.println(cars.length);

        int[] ages ={20,30,22,21,19,25};
        
        float sum = 0, avg = 0;
        for (int miaka : ages) {
            sum += age;
        }
         avg = sum/ages.length;
        System.out.println("The average is: "+avg);
            }
        }
