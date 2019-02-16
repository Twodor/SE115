import java.util.Scanner;
public class Answers
{
    public static int answer(int cho)
    {
        int ans;
        Scanner input=new Scanner(System.in);
        ans=input.nextInt();
        if (ans==-1) {
            return ans;
        }
        if (ans>cho||ans<1&&ans!=-1)
        {
            while (true)
            {
                System.out.println("You enter invalid value for question, enter again");
                ans=Answers.answer(cho);
                if (ans==-1)
                    break;
                if (ans<=3&&ans>=1)
                    break;
            }
        }
        return ans;
    }
}
