import java.util.Scanner;
import java.security.SecureRandom;
public class Puzzle
{
    public static int Fibonacci ()
    {

        int result=0;
        Scanner input=new Scanner(System.in);
        SecureRandom randomlong=new SecureRandom();
        int arraylong=10+randomlong.nextInt(10);
        int fib []=new int[arraylong];
        int ignore=2+randomlong.nextInt(arraylong-3);
        for (int i=0; i<arraylong; i++)
        {
            if (i==0)
            {
                fib[i] =1;
                System.out.print(fib[i]+" ");
            }
            else if (i==1)
            {
              fib [i]=1;
                System.out.print(fib[i]+" ");
            }
            else if (i==ignore)
            {
                fib[i]=fib[i-2]+fib[i-1];
                System.out.print("? ");
            }
            else
            {
                fib[i]=fib[i-2]+fib[i-1];
                System.out.print(fib[i]+" ");
            }
        }
        System.out.println("\nComplete this array.You have 3 attempts (Enter number for ?)");
        int cnt=3;
        while(cnt>0) {
            int fill = input.nextInt();
            if (fill == fib[ignore]) {
                System.out.println("Correct");
                result=1;
                break;

            } else {
                if (cnt!=1)
                    System.out.println("Wrong, try again");
                cnt--;
                result=0;
            }
        }
        return result;
    }
    public static int factorial(int fact)
    {
        if (fact==0)
            return 1;
        else
            return fact*factorial(fact-1);
    }
    public static void Anagram(String[] anagram)
    {
        int randomArray[]=new int[anagram.length];
        SecureRandom stringRandom=new SecureRandom();
        int x=0;
       while (x<randomArray.length)
       {
           int a=stringRandom.nextInt(randomArray.length);
           randomArray[x]=a;
            boolean all=true;
            for (int i=0; i<x; i++)
            {
                if (randomArray[x]==randomArray[i])
                {
                    all=false;
                }
            }
            if (all)
            {

                x++;
            }
       }
       for (int i=0; i<anagram.length; i++)
           System.out.print(anagram[randomArray[i]]);

    }
}

