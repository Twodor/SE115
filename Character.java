public class Character
{
    private String mainname;
    public int stats[]={50,50,50,50,50,0};
    public void setMainname(String mainname)
    {
        this.mainname=mainname;
    }
    public String getMainname()
    {
        return mainname;
    }
    public void addStat(String sn, int a)
    {
        int b=5; // hata olmaması için
        sn=sn.toLowerCase();
        switch (sn)
        {
            case "c": b=0; break;
            case "i": b=1; break;
            case "a": b=2; break;
            case "g": b=3; break;
            case "e": b=4; break;
        }
        stats[b]+=a;
        if (stats[b]>100)
            stats[b]=100;
        else if (stats[b]<0)
            stats[b]=0;
    }
    public void display()
    {
        System.out.println("The stats of "+getMainname());
        System.out.println("Courage: "+stats[0]);
        System.out.println("Intelligence: "+stats[1]);
        System.out.println("Agility: "+stats[2]);
        System.out.println("Goodness: "+stats[3]);
        System.out.println("Evilness: "+stats[4]);
    }

    public int getStats(int i) {
        return stats[i];
    }
}
