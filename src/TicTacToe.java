import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String pchoice="";
        String cchoice = "";

        System.out.println("Choose between rock,paper,scissors");
        Scanner scanner = new Scanner(System.in);
        pchoice = scanner.nextLine().toLowerCase();

        int cintchoice = (int) (Math.random()*3)+1;

        switch (cintchoice){
            case 1:
                cchoice = "rock";
                break;
            case 2:
                cchoice = "paper";
                break;
            case 3:
            cchoice = "scissors";
            break;
        };
        System.out.println("Comp choice is: " +cchoice);
        
        if(pchoice.equals(cchoice)){
            System.out.println("It's a tie");
        } else if (pchoice.equals("scissors") && cchoice.equals("paper")) {
            System.out.println("Player won");
        } else if (pchoice.equals("paper") && cchoice.equals("rock")) {
            System.out.println("Player won");
        } else if (pchoice.equals("rock") && cchoice.equals("scissors")) {
            System.out.println("Player won");
        }else{
            System.out.println("Computer won");
        }

        scanner.close();


    }

}
