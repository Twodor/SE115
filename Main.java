import java.util.Scanner;
public class Main
{
    public static String playername;

    public static void main(String[] args)
    {

        int useStat;
        int answer;
        int useint;
        int userEntInt;
        Scanner input=new Scanner(System.in);
        Character Player=new Character();
        System.out.println("Welcome to Puzzle Game. Please enter your name: ");
        playername=input.next();
        Player.setMainname(playername);
        Player.addStat("e",0);
        System.out.println(Player.getMainname()+",When you want to exit the game, after questions enter -1\n");
        System.out.println(Story.StoryStrings(0));
        answer=Answers.answer(3);
        if (answer==-1)
        {
            Player.display();
            System.exit(0);
        }
        System.out.println(Story.StoryStrings(1));
        answer=Puzzle.Fibonacci();
        if (answer==-1)
        {
            Player.display();
            System.exit(0);
        }
        if (answer==1)
        {
            Player.addStat("i",15);
            System.out.print("A document page pops up on the screen. There writes, all capital in bold:\n" +
                    "HE IS AFTER YOU\n" +
                    "KILL HIM WITH A PIECE OF PURE *ALUMINIUM*\n" +
                    "THE STICK IS INSIDE OF THE****** ");
            String []BRIEFCASE={"B","R","I","E","F","C","A","S","E"};
            Puzzle.Anagram(BRIEFCASE);
            System.out.println("\nAfter **** part, you see word with a mixture letters. Please enter correctly");
            String userEnt=input.next();
            userEnt=userEnt.toLowerCase();
            if (userEnt.equals("briefcase"))
            {
                Player.addStat("i",10);
                System.out.println("Correct!");
            }
            else
            {
                Player.addStat("i",-4);
                System.out.println("Wrong, the correct aswer is BRIEFCASE");
            }
        }
        else
        {
            System.out.print("A document page pops up on the screen. There writes, all capital in bold:\n" +
                    "HE IS AFTER YOU\n" +
                    "KILL HIM WITH A PIECE OF PURE******** ");
            String []ALUMINIUM={"A","L","U","M","I","N","I","U","M"};
            Puzzle.Anagram(ALUMINIUM);
            System.out.println("\nAfter **** part, you see word with a mixture letters. Please enter correctly");
            String firstuserEnt=input.next();
            firstuserEnt=firstuserEnt.toLowerCase();
            if (firstuserEnt.equals("aluminium")) {
                System.out.println("Correct");
                Player.addStat("i",+7);
            }
            else {
                System.out.println("Wrong, the correct asnwer is ALUMINIUM");
                Player.addStat("i",-5);
            }
            System.out.print("THE STICK IS INSIDE OF THE*********");
            String []BRIEFCASE={"B","R","I","E","F","C","A","S","E"};
            Puzzle.Anagram(BRIEFCASE);
            System.out.println("\nAfter **** part, you see word with a mixture letters. Please enter correctly");
            String userEnt=input.next();
            userEnt=userEnt.toLowerCase();
            if (userEnt.equals("briefcase"))
                System.out.println("Correct!");
            else
            {
                System.out.println("Wrong, the correct aswer is BRIEFCASE");
            }
        }
        System.out.println(Story.StoryStrings(2));
        answer=Answers.answer(3);
        if (answer==-1)
        {
            Player.display();
            System.exit(0);
        }
        if (answer==1)
        {
            Player.addStat("c",10);
            System.out.println(Story.StoryStrings(3));
        }
        else if (answer==2)
        {
            Player.addStat("c",-15);
            Player.addStat("a",10);
            System.out.println(Story.StoryStrings(4));
        }
        else
        {
            Player.addStat("g",10);
            System.out.println(Story.StoryStrings(5));
        }
        System.out.println(Story.StoryStrings(6));
        useint=Randoms.betweentwonumbers(1,6);
        answer=Puzzle.factorial(useint);
        System.out.println(useint+"!=?");
        userEntInt=input.nextInt();
        if (userEntInt==answer)
            System.out.println("Password is correct! The lid opens and you find a silver colored stick.\n"+Story.StoryStrings(12));
        else //user enters a wrong value
        {
            System.out.println("The password was wrong. The device closes itself, blocking any other entry. You groan in frustration, smashing the lock on the ground to break it open. And you manage to open it!");
        }
        System.out.println(Story.StoryStrings(12));
        answer=Answers.answer(3);
        if (answer==-1)
        {
            Player.display();
            System.exit(0);
        }
        if (answer==1)
        {
            useStat=Player.getStats(0);
            if (useStat<=50)
            {
                System.out.println(Story.StoryStrings(7));
                Player.display();
                System.exit(0);
            }
            else
            {
                System.out.println(Story.StoryStrings(8));
            }
        }
        else if (answer==2)
        {
            useStat=Player.getStats(2);
            if (useStat<50)
            {
                System.out.println(Story.StoryStrings(9));
                Player.display();
                System.exit(0);
            }
            else
            {
                System.out.println(Story.StoryStrings(10));
            }
        }
        else //answer==3
        {
            System.out.println(Story.StoryStrings(11));
            Player.display();
            System.exit(0);
        }
        System.out.println(Story.StoryStrings(13));
        answer=Answers.answer(3);
        if (answer==-1)
        {
            Player.display();
            System.exit(0);
        }
        if (answer==1)
        {
            System.out.println(Story.StoryStrings(14));
            answer=Answers.answer(2);
            if (answer==-1)
            {
                Player.display();
                System.exit(0);
            }
            if (answer==1)
            {
                System.out.println(Story.StoryStrings(15));
                Player.addStat("g",50);
                Player.display();
                System.exit(0);

            }
            else//answer==2
            {
                System.out.println(Story.StoryStrings(16));
                Player.addStat("e",50);
                Player.display();
                System.exit(0);
            }

        }
        else if (answer==2)
        {
            System.out.println(Story.StoryStrings(17));
            Player.addStat("e",50);
            Player.display();
            System.exit(0);
        }
        else // answer==3
        {
            System.out.println(Story.StoryStrings(18));
            Player.addStat("i",-15);
            Player.display();
            System.exit(0);
        }

    }
}