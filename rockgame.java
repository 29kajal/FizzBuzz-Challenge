import java.util.Random;
import java.util.Scanner;

public class Main{
    public static String generateComputerChoice(Random random)
    {
       int num;
       num=random.nextInt(3)+1;
       String computerChoice=" ";
       if(num==1)
       {
           computerChoice ="rock";
       }
       else if(num==2)
       {
           computerChoice ="paper";
       }
       else if(num==3)
       {
           computerChoice ="scissor";
       }
       else
       {
         System.out.println("invalid number!!");
       }
       System.out.println("The computer already made choice");
       return computerChoice;
    }


public static void showMenu()
{
    System.out.println("Optons to choose from \n1.Rock \n2.Paper \n3.Scissor");
}

public static String getUserChoice(Scanner Scanner)
{
    String userChoice=" ";
    System.out.println("Please make yours:");
    userChoice=Scanner.nextLine();
    return userChoice;
}

public static String chooseWinner(String computerChoice, String userChoice)
{
    String winner="No winner";
    String cMsg="Both Choose Same !!";
    String finalMsg=" ";
    String rockcMsg="The rock smashes the scissor ";
    String papercMsg="Paper wraps rock";
    String scissorcMsg="Scissor cut paper";
    
    if(computerChoice.equals("rock") && userChoice.equalsIgnoreCase("scissor"))
    {
        winner="Computer";
        cMsg=rockcMsg;
    }
    else if(userChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissor"))
    {
        winner="User";
        cMsg=scissorcMsg;
    }
    
    if(computerChoice.equals("scissor") && userChoice.equalsIgnoreCase("paper"))
    {
        winner="Computer";
        cMsg=scissorcMsg;
    }
    else if(userChoice.equalsIgnoreCase("paper") && computerChoice.equals("scissor"))
    {
         winner="User";
        cMsg=papercMsg;
    }
        
    if(computerChoice.equals("paper") && userChoice.equalsIgnoreCase("rock"))
    {
        winner="Computer";
        cMsg=papercMsg;
    }
    else if(userChoice.equalsIgnoreCase("rock") && computerChoice.equals("paper"))
    {
        winner="User";
        cMsg=rockcMsg;
    }
    finalMsg=winner + "won(" + cMsg +")";
    return finalMsg;
        
}

 public static void main(String[] args)
 {
     Random random=new Random();
     Scanner scanner=new Scanner(System.in);
     String computerChoice,userchoice,winner;
     showMenu();
     computerChoice=generateComputerChoice(random);
     userChoice = getuserChoice(Scanner);
     winner=chooseWinner(computerChoice,userChoice);
     System.out.println("You choose:" +userChoice +"\nComputer choose:" + computerChoice);
     System.out.println(winner);
 }}

 