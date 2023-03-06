import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA ="";
        String playerB ="";
        String restart ="";
        boolean done = false;

        System.out.println("\tWELCOME TO ROCK PAPER SCISSORS GAME\n");
            do{

                do {
                    System.out.print("Enter Your Move Player A [R P S]: ");
                    playerA = in.nextLine();
                    if (playerA.equalsIgnoreCase("R")) {
                        done = true;
                    }
                    else if (playerA.equalsIgnoreCase("P"))
                    {
                        done = true;
                    }
                    else if (playerA.equalsIgnoreCase("S"))
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("invalid input!! You must Input R, P or S ");
                    }

                } while (!done);

               done=false;
                do {
                    System.out.print("Enter Your Move Player B [R P S]: ");
                    playerB = in.nextLine();
                    if (playerB.equalsIgnoreCase("R"))
                    {
                        done = true;
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        done = true;
                    }
                    else if (playerB.equalsIgnoreCase("S"))
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("invalid input!! You must Input R, P or S ");
                    }

                } while (!done);


                if (playerA.equalsIgnoreCase("R"))
                {
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("\tRock Vs Rock!! Its a Tie");
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("\tPaper covers Rock!! Player B win!!!");
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("\tRock Break Scissor!! Player A win!!");
                    }
                }
                if (playerA.equalsIgnoreCase("P"))
                {
                    if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("\tPaper Vs Paper!! Its a Tie");
                    } else if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("\tPaper covers Rock!! Player A win!!!");
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("\tScissor cut paper!! Player B win!!");
                    }
                }
                if (playerA.equalsIgnoreCase("S"))
                {
                    if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("\tScissor Vs Scissor!! Its a Tie");
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("\tScissor cut paper !! Player A win!!!");
                    } else if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("\tRock Break Scissor!! Player B win!!");
                    }
                }

                    System.out.print("Do You Want To Play Again [Y/N]? ");
                    restart = in.nextLine();
                if (restart.equalsIgnoreCase("N"))
                {

                    System.exit(0);
                }

                }while(restart.equalsIgnoreCase("Y"));










    }
}