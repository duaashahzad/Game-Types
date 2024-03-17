import java.util.Scanner;
public class Run_Game
{
    public static void main(String[] args)
    {
        Board_Game bg1 = new Board_Game();
        Computer_Game cg1 = new Computer_Game();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter description for your board game selection below: ");
        String b = scan.nextLine();

        bg1.setDescription(b);
        bg1.setTimeLimit(3);
        bg1.setNumPlayer(10);

        System.out.println("Selected board game :" + bg1.getDescription());
        System.out.println("Minimum Players :" + bg1.getNumPlayer());
        System.out.println("Time Limit :" + bg1.getTimeLimit());

        System.out.println("\nPlease enter your description for your computer game selection below: ");
        String c = scan.nextLine();

        cg1.setDescription(c);

        System.out.println("Selected board game :" + cg1.getDescription());
        System.out.println("Game Types");


    }
}
