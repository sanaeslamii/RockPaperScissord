import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int ai_score = 0;
        int user_score = 0;

        String ai_choise = null;
        int n = rand.nextInt(3);
        if (n == 0)
            ai_choise = "Rock";
        else if (n == 1)
            ai_choise = "Paper";
        else if (n == 2)
            ai_choise = "Scissors";
       

        System.out.print("Enter Your Choise(round 1): \n");
        Userchoise user1 = new Userchoise(input.next());
        String user_choise = user1.getUser();
        
        
        if(ai_choise.equals(user_choise))
            System.out.print("Mosavi Shod!\n");
        else if(user_choise.equals("Paper")  && ai_choise.equals("Rock") )
            user_score++;
        else if(user_choise.equals("Rock") && ai_choise.equals("Scissors"))
            user_score++;
        else if(user_choise.equals("Scissors") && ai_choise.equals("Paper"))
            user_score++;

        else if(ai_choise.equals("Paper")  && user_choise.equals("Rock") )
            ai_score++;
        else if(ai_choise.equals("Rock") && user_choise.equals("Scissors"))
            ai_score++;
        else if(ai_choise.equals("Scissors") && user_choise.equals("Paper"))
            ai_score++;
        else
            System.out.print("Invalid Input!!!");


        if(user_score == ai_score)
            System.out.print("kasi Nabord");
        else if(user_score > ai_score)
            System.out.println("You Win!\nYou Choose: " + user_choise +" and Your Score is: " + user_score + "\nAI Choose is:" + ai_choise + " and AI Score is: " +ai_score);
        else
        System.out.println("You Lost!\nYou Choose: " + user_choise +" and Your Score is: " + user_score + "\nAI Choose is:" + ai_choise + " and AI Score is: " + ai_score);

        input.close();
    }
}
