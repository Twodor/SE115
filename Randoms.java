import java.util.Random;
public class Randoms
{
    public static int betweentwonumbers(int s, int b)
    {
        if (s>b)
            b=s;
        s=b-s;
        Random betweentwonumbers=new Random();
     int random=s+betweentwonumbers.nextInt(s+1);
     return random;
    }
}
