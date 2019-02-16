import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;


public class ex2
{
    public static String username;
    JFrame window;
    JFrame newFrame = new JFrame("New Window");
    JFrame window2;
    Container con2;

    Container con;
    JPanel picturePanel,maintextpicture,maintextpanel,  maintextpanel2,maintextpanelconf,CreditTextPanel ,choiseButtonpanel;
    JPanel playerpanel,maintextpanel5,maintextpanelrnw,maintextpanel4;
    JLabel pictureLabel,mainpiclabel;
    JLabel hplabel,hplabelNumber,notlabel;
    ImageIcon img1,img2;
    JPanel textPanel,Play,Exit,Credit,next,cat,text,info;
    JLabel textlabel;
    JButton Playbutton,Exitbutton,Creditbutton,nextbutton,catbutton;
    JButton choise1,choise2,infobutton,choise3,choise4;
    JTextArea mainTextArea,CreditTextArea,textArea;
    Font titlefont=new Font("Times New Roman",Font.PLAIN,90);
    Font Playfont =new Font("Times New Roman",Font.PLAIN,40);
    Font normalFont=new Font("Times New Roman",Font.PLAIN,20);
    Font minnak =new Font("Times New Roman",Font.PLAIN,10);
    TitleScreenHandler tsHandler=new TitleScreenHandler();
    infoshow ifs=new infoshow();
    gms3nextx next2x=new gms3nextx();
    gms3nexty next2y=new gms3nexty();
    gms3nextz next2z=new gms3nextz();
    choise1 coffe=new choise1();
    choise2 tea=new choise2();
    confront a=new confront();
    runaway b=new runaway();
    talk c=new talk();

    int hp;

    next1 next1= new next1();
    CreditScreen credit1=new CreditScreen();
      pıtırcık pıt =new pıtırcık();
      ex3 ex3=new ex3();

      character x=new character();



    public static void main(String args[])
    {
        new ex2();

    }
    public ex2()
    {
        character x=new character();
        window =new JFrame();
        window.setSize(800,600);

        window.setTitle("Text Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        con= window.getContentPane();





        textPanel= new JPanel();
        textPanel.setBounds(200,200,500,95);
        textPanel.setBackground(new Color(0,0,0,0));
        textlabel=new JLabel("TEXT GAME");
        textlabel.setForeground(Color.WHITE);
        textlabel.setFont(titlefont);
        textPanel.add(textlabel);

        Play=new JPanel();
        Play.setBounds(250,300,100,52);
        Play.setBackground(Color.WHITE);
        Exit=new JPanel();
        Exit.setBounds(250,400,100,52);
        Exit.setBackground(Color.WHITE);
        Credit=new JPanel();
        Credit.setBounds(250,500,100,52);
        Credit.setBackground(Color.WHITE);

         con.add(textPanel);
         con.add(Play);
         con.add(Exit);
         con.add(Credit);

         Playbutton =new JButton("Play");
         Playbutton.setBackground(Color.getColor("Blue",135));
         Playbutton.setForeground(Color.WHITE);
         Playbutton.setFont( Playfont);
         Playbutton.setFocusPainted(false);
         Playbutton.addActionListener(tsHandler);
         Exitbutton=new JButton("Exit");
        Exitbutton.setBackground(Color.getColor("Blue",135));
         Exitbutton.setForeground(Color.WHITE);
        Exitbutton.setFont(Playfont);
        Exitbutton.setFocusPainted(false);
        Exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);

            }
        });

         Creditbutton=new JButton("Credit");
         Creditbutton.setBackground(Color.getColor("Blue",135));
         Creditbutton.setForeground(Color.WHITE);
        Creditbutton.setFont(Playfont);
        Creditbutton.setFocusPainted(false);
        Creditbutton.addActionListener(credit1);


         Play.add(Playbutton);
         Exit.add(Exitbutton);
         Credit.add(Creditbutton);



            picturePanel = new JPanel();
            picturePanel.setBounds(0, 0, 800, 600);
            picturePanel.setBackground(Color.DARK_GRAY);
            con.add(picturePanel);
            pictureLabel = new JLabel();
            img1 = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\298037-nyan-cat-800x600.jpg");
            pictureLabel.setIcon(img1);
            picturePanel.add(pictureLabel);


            window.setVisible(true);

         //username = JOptionPane.showInputDialog(null, "Player Name");








    }
    public void createGameScreen()
    {

         textPanel.setVisible(false);
         Play .setVisible(false);
         Exit.setVisible(false);
         Credit.setVisible(false);

          picturePanel.setVisible(false);
        info=new JPanel();
        info.setBounds(600,20,100,45);
        info.setBackground(new Color(0,0,0,100));
        con.add(info);


          cat=new JPanel();
        cat.setBounds(0,0 ,100,30);
        cat.setBackground(Color.WHITE);
        con.add(cat);





        playerpanel=new JPanel();
        playerpanel.setBounds(100,0,600,90);
        playerpanel.setBackground(new Color(0,0,0,150));
        playerpanel.setLayout(new GridLayout(1,4));
        con.add(playerpanel);
        hplabel =new JLabel("HP:");
        hplabel.setFont(normalFont);
        hplabel.setForeground(Color.WHITE);
        playerpanel.add(hplabel);
        hplabelNumber=new JLabel();
        hplabelNumber.setFont(normalFont);
        hplabelNumber.setForeground(Color.WHITE);
        playerpanel.add(hplabelNumber);
        notlabel =new JLabel("NOTPAD");
        notlabel.setFont(normalFont);
        notlabel.setForeground(Color.WHITE);
        playerpanel.add(notlabel);

        catbutton =new JButton("PITIRCIK");
        catbutton.setBackground(Color.getColor("Blue",135));
        catbutton.setForeground(Color.WHITE);
        catbutton.setFont( normalFont);
        catbutton.setFocusPainted(false);
        catbutton.addActionListener(  pıt);
        cat.add( catbutton);

        infobutton=new JButton("info");
        infobutton.setBackground(Color.BLACK);
        infobutton.setForeground(Color.WHITE);
        infobutton.setFont(normalFont);
        infobutton.setFocusPainted(false);
        infobutton.addActionListener(ifs);
        info.add(infobutton);

        next=new JPanel();
        next.setBounds(650,500 ,100,100);
        next.setBackground(Color.WHITE);
        next.setOpaque(false);
        con.add(next);
        nextbutton =new JButton("Next");
        nextbutton.setBackground(Color.getColor("Blue",135));
        nextbutton.setForeground(Color.WHITE);
        nextbutton.setFont( Playfont);
        nextbutton.setFocusPainted(false);
        nextbutton.addActionListener(next1 );
        nextbutton.setOpaque(false);
        next.add(nextbutton);

        maintextpanel2=new JPanel();
        maintextpanel2.setBounds(100,100,600,250);
        maintextpanel2.setBackground(Color.black);
        con.add(maintextpanel2);


        maintextpicture=new JPanel();

        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);





        mainTextArea =new JTextArea("In a gloomy and dark evening, your sigh echoes through the narrow backstreet, your steps heavy and slow as you walk to your destination. It has been a tiring day from the start; your toaster overheating the bread, the shower head breaking when you most needed it and your cat scratching your hand with a loud hiss -you'd only wanted to stroke her soft brown fur-. Well, maybe she had given up on you, too.");

        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normalFont);
         mainTextArea.setLineWrap(true);
         mainTextArea.setWrapStyleWord(true);
         maintextpanel2.add(mainTextArea);
         hp();



    }


    public void gameScreen2 ()
    {
         next.setVisible(false);
         maintextpicture.setVisible(false);
         maintextpanel2.setVisible(false);





       maintextpanel=new JPanel();
        maintextpanel.setBounds(100,90,560,310);
        maintextpanel.setBackground(Color.black);
        con.add(maintextpanel);
        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("Your coworker Yuan says the manager only wants the best for the company, that's why he's this strict, but Yuan had always been too sweet to hate on even the Lucifer himself. So you only nod and offer her a smile, like always.\n" +
                "You keep walking until the last apartment on the street, stopping in front of the old gray building. A small tea house named \"Zhumi Wong\" welcomes you, your regular stop for a peaceful evening after a hectic day. The smell of freshly brewed tea and cream hits you the moment you open the door and take a step in, your lips curling up to a small smile.\n" +
                "There are a few customers sitting on the small tables; office workers like you, old ladies and a few highschool students chatting among themselves. You walk to a secluded corner and sit on the uncomfortable chair. The tea house's old waiter Xiumin appears next to your table in an instant, giving you a fatherly smile.\n \"Good evening, son.\n\" he says.\n \"How was your day?\"\n" +
                "You bow your head respectfully.\n \"It was tiring as usual, Uncle Xiumin. Nothing new.\"\n" +
                "\n\"I see. Working is always tiring.\" he nods understandingly.\n \"So what would you like to have?\"\n" );

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanel.add(textArea,BorderLayout.CENTER);
        JScrollPane sp= new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        maintextpanel.add(sp);
        choiseButtonpanel=new JPanel();
        choiseButtonpanel.setBounds(250,400,300,150);
        choiseButtonpanel.setBackground(new Color(0,0,0,100));
        choiseButtonpanel.setLayout(new GridLayout(2,1));
        con.add(choiseButtonpanel);




        choise1 =new JButton("coffe");
        choise1.setBackground( Color.DARK_GRAY);
        choise1.setForeground(Color.WHITE);
        choise1.setFont(Playfont);
        choiseButtonpanel.add(choise1);
         choise1.setFocusPainted(false);
         choise1.addActionListener(coffe);

        choise2 =new JButton("tea");
        choise2.setBackground(Color.DARK_GRAY) ;
        choise2.setForeground(Color.WHITE);
        choise2.setFont(Playfont);
        choiseButtonpanel.add(choise2);
        choise2.setFocusPainted(false);
        choise2.addActionListener(tea);

        maintextpicture=new JPanel();

        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
        hp();


    }
    public void gameScreen3()
    {
        maintextpanel.setVisible(false);
        maintextpicture.setVisible(false);
        choiseButtonpanel.setVisible(false);
        cat.setVisible(false);
        maintextpanel5=new JPanel();
        maintextpanel5.setBounds(100,90,560,310);
        maintextpanel5.setBackground(Color.black);
        con.add(maintextpanel5);
        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("\"Alright, coming right away.\" he smiles again.\n" +
                "You also smile at him, nodding once. He walks away and disappears from around the corner to the kitchen. You take a deep breath and turn to look outside from the window. You can see the main street from between two long apartments, cars passing by. The city of Hong Kong is always busy, millions of people trying to rush to somewhere. It tires you sometimes. You don't know why, but you've been feeling like you don't belong to this place lately. Like you don't belong to this life.\n" +
                "A soft chuckle escapes your lips, finding your thoughts unnecessary and funny. You return back to the present.\n" +
                "While you wait for your order, you study the tea house. The place is too old, decorated traditionally. It has every single cliche thing about China inside; dragon heads, small poems written in the old tongue hanged on the wall, antique tea plates and wine glasses displayed in glass cases next to the bar. The high school students leave after they pay for their teas. You watch them walk away with laughter, making silly jokes.\n" +
                "As they disappear around the corner on the street, you suddenly feel chills running down your spine. You frown, looking around. It’s like someone is watching you.\n" +
                "Or maybe, someone has been watching you.\n" +
                "There -a little to your right, near the window seat- sits another person, an empty tea cup in front of him, holding a newspaper in his hands. You cannot see his face like this, but the uneasy feeling inside your chest hasn’t subsided yet. In fact, it doubles as the man changes the page, tilting the paper in his hands, allowing his face to be seen.\n" +
                "He looks… Just like you.\n" +
                "You narrow your eyes, focusing on the person, but it is too late as he lifts the paper again, covering his face.\n" +
                "You lean back on your seat, closing your eyes and rubbing your temples. It seems that it really has been a long day for you, you even started hallucinating. You are sure that you don’t have a twin and you are also sure that it is impossible for two people to look that alike. You need to rest, you decide.\n" +
                "Uncle Xiumin approaches you with your order, putting it on your table and telling you to enjoy it. He walks away again, leaving you alone. You sigh, finishing up your order quickly and reach to your wallet to take a few Yuans. Just before you can put the money on the table, your gaze shifts to the mysterious man.\n" +
                "This time, he doesn’t have the newspaper. He is looking straight at you, not even blinking. You find a few seconds to study his face.\n" +
                "You weren’t hallucinating at all. The man is your exact copy.\n" +
                "What is going on?\n" +
                "Is this a joke?\n" +
                "You stand up from your seat, thankful that your legs aren’t shaking, and start walking away with quick steps. You try not to look back as you get out of the tea house and make your way out of the backstreet. It is hard to hold yourself, but you manage to walk away without looking back. Until, you hear heavy footsteps.\n" +
                "Is it that man?\n" +
                "You gulp down the knot in the middle of your throat, slowing down for a second to listen, making sure that you heard it right.\n" +
                "The footsteps get clearer, closer. \n" +
                "You finally gather enough courage to turn to your back.\n" +
                "The street is empty.\n" +
                "A sigh of relief escapes your lips, your heart still hammering inside your chest. You shake your head, turning again and continuing, walking so fast that you are almost running. After a quick walk to your house which was full of fear and paranoia, you fumble around in your pocket to find your keys, opening the door and entering. You close the door a little too harshly, hoping that no one in the apartment heard you do that. Your tired legs carry you to your flat on the fourteenth floor. Once you get inside, locking the door and closing all the windows are the first things you do. You take off your shoes and jacket, sighing after throwing yourself on the couch.\n" +
                "Too much for a peaceful evening. Seems that the universe hates you, never giving you a break.\n" +
                "You frown as you stare at the black screen of the small television in front of you. At first, you could say that it was only your imagination, nothing much. Your mind was tired, after all. But then, after seeing him clearly?\n" +
                "You couldn’t have been dreaming.\n" +
                "Right?\n" +
                "You groan, rubbing your eyes and temples to save yourself from the headache, even for a bit. If your coworkers hear this, they will laugh at your face and tell you that you are going insane.\n" +
                "Maybe you really are.\n" +
                "You change your clothes and prepare dinner; instant noodles. You put your cat’s meal as well, with some water on the side. She meows and accepts a soft pat on her head. You sit down in front of the TV again and open it, zapping through various channels while munching on your noodle. After you are done, you leave the plate on the small coffee table.\n" +
                "“Time to check my emails…” you murmur to yourself. You stand up and cross the room, entering the kitchen and looking for your laptop. There it stands on the place you put it, except…\n" +
                "The screen is open.\n" +
                "You never leave it open.\n" +
                "You frown, getting closer and noticing that a document page is shown on the screen. There writes, all capital in bold:\n" +
                "HE IS AFTER YOU\n" +
                "KILL HIM WITH A PIECE OF PURE ALUMINIUM\n" +
                "What?\n" +
                "Who left this note? How?\n" +
                "A million questions swarm your mind as you keep staring at the screen, curious, wondering. Then it hits you. Was that man real? Is this note talking about him?\n" +
                "But then, who is it again?\n" +
                "You groan to yourself, rubbing your eyes and temples. This is a terrible nightmare and you want to wake up already.\n" +
                "You need to sleep. You definitely need to sleep. Whatever this is, it can wait until the morning. Hopefully you will not be murdered pathetically in your sleep.\n" +
                "With a heavy headache, you lie down on your bed. Sleep doesn’t come easy to you, but you drift off eventually.\n" +
                "-*-*-*-*-*-\n" +
                "The next morning feels like any usual one, you getting up and having breakfast. You make your way to your wardrobe and open it, wearing a suit. You find and grab your briefcase, but it feels too heavy. You don’t remember putting too many documents in it. You open it to see what it is, and find a gray, thin stick almost the length of your briefcase. There is a note attached to it and it writes, just like the note you saw on your computer: “THANK ME LATER.”\n" +
                "You frown, leaving the note on the floor and examining the stick. So, is this the piece of aluminium?\n" +
                "How was the person able to find such thing and put it in your briefcase without you knowing it?\n" +
                "This gets scarier with every moment.\n" +
                "You decide to keep the stick in your briefcase and leave your house. You look around carefully in case that man is around. Everything seems normal with old ladies hanging fresh clothes on their balconies, shop keepers cleaning their shop, children playing. You take a deep breath and start walking. Here is the thing, Hong Kong is really crowded, but there are secluded streets all around where no soul visits and your route involves them. You walk for a while through them, the morning still dark and cold. It is only when you turn a corner, and there is a man standing completely still in the middle of it. He is just looking at you.\n" +
                "It is him.   \n" +
                "What do you do?\n");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanel5.add(textArea,BorderLayout.CENTER);
        JScrollPane sp= new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        maintextpanel5.add(sp);
        choiseButtonpanel=new JPanel();
        choiseButtonpanel.setBounds(250,400,300,150);
        choiseButtonpanel.setBackground(new Color(0,0,0,100));
        choiseButtonpanel.setLayout(new GridLayout(3,1));
        con.add(choiseButtonpanel);




        choise3 =new JButton("Confront him. Enough hiding like a rat!\n ");
        choise3.setBackground( Color.DARK_GRAY);
        choise3.setForeground(Color.WHITE);
        choise3.setFont(minnak);
        choiseButtonpanel.add(choise3);
        choise3.setFocusPainted(false);
        choise3.addActionListener(a);


        choise4 =new JButton("Run away. No way you are getting killed today. ");
        choise4.setBackground(Color.DARK_GRAY) ;
        choise4.setForeground(Color.WHITE);
        choise4.setFont(minnak);
        choiseButtonpanel.add(choise4);
        choise4.setFocusPainted(false);
        choise4.addActionListener(b);

        choise1 =new JButton("Try to talk to him. Maybe you can convince him into leaving.");
        choise1.setBackground( Color.DARK_GRAY);
        choise1.setForeground(Color.WHITE);
        choise1.setFont(minnak);
        choiseButtonpanel.add(choise1);
        choise1.setFocusPainted(false);
        choise1.addActionListener(c);


        maintextpicture=new JPanel();
        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
hp();





    }
    public void gameScreen4x()
    {

        maintextpanel.setVisible(false);
        maintextpicture.setVisible(false);
        choiseButtonpanel.setVisible(false);
        cat.setVisible(false);



        maintextpanel4=new JPanel();
        maintextpanel4.setBounds(100,90,560,310);
        maintextpanel4.setBackground(Color.black);
        con.add(maintextpanel4);
        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("You are knocked out for a second and you finally gather some strength to hit him on the face with the briefcase.\n" +
                "He groans and rolls over from on top of you as you finally stand up and stumble on your feet.\n" +
                "You immediately open your briefcase and reach for the aluminium stick, but before you can grab it, he closes the gap between you and him in a second and kicks your stomach.\n" +
                "You double over in pain, the briefcase flying away from your reach. You lift your head and dock right on time from his punch, jumping on him in a tackle. You make him fall and throw a strong punch on his face, stunning him. He is grunting in pain while you force yourself to get up and crawl to your briefcase and finally open it, taking the stick out.\n" +
                "“Pure aluminium?” the man coughs out, blood coming out of his mouth and slowly trailing down to his chin. “How did you find that? No, stay back! Don’t come any closer!”\n" +
                "You tackle him on the ground again, putting the long stick on his throat, the skin beginning to burn slowly. “I need answers first! Who are you? What do you want from me?” you shout.\n" +
                "The man chokes, struggling to get the stick away from his throat, his skin still burning and blood oozing out of it. “I was telling you the truth!.. I am your brother! I saw it all, saw what you did! I came from the past to kill you!”\n" +
                "You frown, lips parting as your chest heaves. “W-what are you talking about? You came from the past? This doesn’t makes sense!”\n" +
                "“Then let me show you!” he grunts and reaches to grab your nape, his eyes glowing white. There is that infinite brightness first, but then, complete darkness.\n");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanel4.add(textArea,BorderLayout.CENTER);
        JScrollPane sp= new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        maintextpanel4.add(sp);



        maintextpicture=new JPanel();
        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
        hp();


    }
    public void gameScreen4y()
    {

        maintextpanel.setVisible(false);
        maintextpicture.setVisible(false);
        choiseButtonpanel.setVisible(false);
        cat.setVisible(false);



        maintextpanel4=new JPanel();
        maintextpanel4.setBounds(100,90,560,310);
        maintextpanel4.setBackground(Color.black);
        con.add(maintextpanel4);
        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("You are knocked out for a second and you finally gather some strength to hit him on the face with the briefcase.\n" +
                "He groans and rolls over from on top of you as you finally stand up and stumble on your feet.\n" +
                "You immediately open your briefcase and reach for the aluminium stick, but before you can grab it, he closes the gap between you and him in a second and kicks your stomach.\n" +
                "You double over in pain, the briefcase flying away from your reach. You lift your head and dock right on time from his punch, jumping on him in a tackle. You make him fall and throw a strong punch on his face, stunning him. He is grunting in pain while you force yourself to get up and crawl to your briefcase and finally open it, taking the stick out.\n" +
                "“Pure aluminium?” the man coughs out, blood coming out of his mouth and slowly trailing down to his chin. “How did you find that? No, stay back! Don’t come any closer!”\n" +
                "You tackle him on the ground again, putting the long stick on his throat, the skin beginning to burn slowly. “I need answers first! Who are you? What do you want from me?” you shout.\n" +
                "The man chokes, struggling to get the stick away from his throat, his skin still burning and blood oozing out of it. “I was telling you the truth!.. I am your brother! I saw it all, saw what you did! I came from the past to kill you!”\n" +
                "You frown, lips parting as your chest heaves. “W-what are you talking about? You came from the past? This doesn’t makes sense!”\n" +
                "“Then let me show you!” he grunts and reaches to grab your nape, his eyes glowing white. There is that infinite brightness first, but then, complete darkness.\n");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanel4.add(textArea,BorderLayout.CENTER);
        JScrollPane sp= new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        maintextpanel4.add(sp);



        maintextpicture=new JPanel();
        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
        hp();


    }
    public void gameScreen4z()
    {

        maintextpanel.setVisible(false);
        maintextpicture.setVisible(false);
        choiseButtonpanel.setVisible(false);
        cat.setVisible(false);



        maintextpanel4=new JPanel();
        maintextpanel4.setBounds(100,90,560,310);
        maintextpanel4.setBackground(Color.black);
        con.add(maintextpanel4);
        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("You are knocked out for a second and you finally gather some strength to hit him on the face with the briefcase.\n" +
                "He groans and rolls over from on top of you as you finally stand up and stumble on your feet.\n" +
                "You immediately open your briefcase and reach for the aluminium stick, but before you can grab it, he closes the gap between you and him in a second and kicks your stomach.\n" +
                "You double over in pain, the briefcase flying away from your reach. You lift your head and dock right on time from his punch, jumping on him in a tackle. You make him fall and throw a strong punch on his face, stunning him. He is grunting in pain while you force yourself to get up and crawl to your briefcase and finally open it, taking the stick out.\n" +
                "“Pure aluminium?” the man coughs out, blood coming out of his mouth and slowly trailing down to his chin. “How did you find that? No, stay back! Don’t come any closer!”\n" +
                "You tackle him on the ground again, putting the long stick on his throat, the skin beginning to burn slowly. “I need answers first! Who are you? What do you want from me?” you shout.\n" +
                "The man chokes, struggling to get the stick away from his throat, his skin still burning and blood oozing out of it. “I was telling you the truth!.. I am your brother! I saw it all, saw what you did! I came from the past to kill you!”\n" +
                "You frown, lips parting as your chest heaves. “W-what are you talking about? You came from the past? This doesn’t makes sense!”\n" +
                "“Then let me show you!” he grunts and reaches to grab your nape, his eyes glowing white. There is that infinite brightness first, but then, complete darkness.\n");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanel4.add(textArea,BorderLayout.CENTER);
        JScrollPane sp= new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        maintextpanel4.add(sp);



        maintextpicture=new JPanel();
        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
        hp();


    }
    public class TitleScreenHandler implements  ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            createGameScreen();


        }

    }
    public class next1 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            gameScreen2();



        }
    }
    public  void cat ()

    {


        maintextpanel.setVisible(false);
        next.setVisible(false);
        maintextpicture.setVisible(false);
        cat.setVisible(false);
        choiseButtonpanel.setVisible(false);
        playerpanel.setVisible(false);
        info.setVisible(false);
        maintextpanel2.setVisible(false);






        textPanel= new JPanel();
        textPanel.setBounds(200,200,500,95);
        textPanel.setBackground(new Color(0,0,0,0));
        textlabel=new JLabel("TEXT GAME");
        textlabel.setForeground(Color.WHITE);
        textlabel.setFont(titlefont);
        textPanel.add(textlabel);

        Play=new JPanel();
        Play.setBounds(250,300,100,52);
        Play.setBackground(Color.WHITE);
        Exit=new JPanel();
        Exit.setBounds(250,400,100,52);
        Exit.setBackground(Color.WHITE);
        Credit=new JPanel();
        Credit.setBounds(250,500,100,52);
        Credit.setBackground(Color.WHITE);

        con.add(textPanel);
        con.add(Play);
        con.add(Exit);
        con.add(Credit);

        Playbutton =new JButton("Play");
        Playbutton.setBackground(Color.getColor("Blue",135));
        Playbutton.setForeground(Color.WHITE);
        Playbutton.setFont( Playfont);
        Playbutton.setFocusPainted(false);
        Playbutton.addActionListener(tsHandler);
        Exitbutton=new JButton("Exit");
        Exitbutton.setBackground(Color.getColor("Blue",135));
        Exitbutton.setForeground(Color.WHITE);
        Exitbutton.setFont(Playfont);
        Exitbutton.setFocusPainted(false);
        Exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);

            }
        });

        Creditbutton=new JButton("Credit");
        Creditbutton.setBackground(Color.getColor("Blue",135));
        Creditbutton.setForeground(Color.WHITE);
        Creditbutton.setFont(Playfont);
        Creditbutton.setFocusPainted(false);
        Creditbutton.addActionListener(credit1);


        Play.add(Playbutton);
        Exit.add(Exitbutton);
        Credit.add(Creditbutton);



        picturePanel = new JPanel();
        picturePanel.setBounds(0, 0, 800, 600);
        picturePanel.setBackground(Color.DARK_GRAY);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        img1 = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\298037-nyan-cat-800x600.jpg");
        pictureLabel.setIcon(img1);
        picturePanel.add(pictureLabel);





    }
    public class pıtırcık implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            cat();
        }

    }
    public void Creditphage()
    {

        textPanel.setVisible(false);
        Play .setVisible(false);
        Exit.setVisible(false);
        Credit.setVisible(false);
        picturePanel.setVisible(false);
        playerpanel.setVisible(false);
        info.setVisible(false);
        maintextpanel.setVisible(false);

        cat=new JPanel();
        cat.setBounds(0,0 ,100,30);
        cat.setBackground(Color.WHITE);
        con.add(cat);



        catbutton =new JButton("PITIRCIK");
        catbutton.setBackground(Color.getColor("Blue",135));
        catbutton.setForeground(Color.WHITE);
        catbutton.setFont( normalFont);
        catbutton.setFocusPainted(false);
        catbutton.addActionListener(ex3);
        cat.add( catbutton);


        CreditTextPanel =new JPanel();
        CreditTextPanel.setBackground(Color.black);
        CreditTextPanel.setBounds(100,100,600,250);
        con.add(CreditTextPanel);

        CreditTextArea=new JTextArea("Öykü DÜVENCİOĞLU\n" +
                "Uğur DURA\n" +
                "Deniz YELLİ\n");
        CreditTextArea.setBackground(Color.black);
        CreditTextArea.setBounds(100,100,600,250);
        CreditTextArea.setFont(Playfont);
        CreditTextArea.setForeground(Color.WHITE);
        CreditTextArea.setLineWrap(true);
        CreditTextPanel.add(CreditTextArea);

    }
    public class CreditScreen implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Creditphage();
        }
    }
    public class ex3 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            startscreen();
        }
    }
    public void startscreen()
    {
        CreditTextPanel.setVisible(false);
        cat.setVisible(false);
        playerpanel.setVisible(false);

        textPanel= new JPanel();
        textPanel.setBounds(200,200,500,95);
        textPanel.setBackground(new Color(0,0,0,0));
        textlabel=new JLabel("TEXT GAME");
        textlabel.setForeground(Color.WHITE);
        textlabel.setFont(titlefont);
        textPanel.add(textlabel);

        Play=new JPanel();
        Play.setBounds(250,300,100,52);
        Play.setBackground(Color.WHITE);
        Exit=new JPanel();
        Exit.setBounds(250,400,100,52);
        Exit.setBackground(Color.WHITE);
        Credit=new JPanel();
        Credit.setBounds(250,500,100,52);
        Credit.setBackground(Color.WHITE);

        con.add(textPanel);
        con.add(Play);
        con.add(Exit);
        con.add(Credit);

        Playbutton =new JButton("Play");
        Playbutton.setBackground(Color.getColor("Blue",135));
        Playbutton.setForeground(Color.WHITE);
        Playbutton.setFont( Playfont);
        Playbutton.setFocusPainted(false);
        Playbutton.addActionListener(tsHandler);
        Exitbutton=new JButton("Exit");
        Exitbutton.setBackground(Color.getColor("Blue",135));
        Exitbutton.setForeground(Color.WHITE);
        Exitbutton.setFont(Playfont);
        Exitbutton.setFocusPainted(false);
        Exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);

            }
        });

        Creditbutton=new JButton("Credit");
        Creditbutton.setBackground(Color.getColor("Blue",135));
        Creditbutton.setForeground(Color.WHITE);
        Creditbutton.setFont(Playfont);
        Creditbutton.setFocusPainted(false);
        Creditbutton.addActionListener(credit1);


        Play.add(Playbutton);
        Exit.add(Exitbutton);
        Credit.add(Creditbutton);



        picturePanel = new JPanel();
        picturePanel.setBounds(0, 0, 800, 600);
        picturePanel.setBackground(Color.DARK_GRAY);
        con.add(picturePanel);
        pictureLabel = new JLabel();
        img1 = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\298037-nyan-cat-800x600.jpg");
        pictureLabel.setIcon(img1);
        picturePanel.add(pictureLabel);
    }

   public class infoshow implements ActionListener
   {
       public void actionPerformed(ActionEvent event)
       {

           newFrame.setVisible(true);
           con2=newFrame;
           character x=new character();

           newFrame.setSize(300,300);
           maintextpanel=new JPanel();
           maintextpanel.setBounds(0,0,200,200);
           maintextpanel.setBackground(Color.BLACK);
           con2.add(maintextpanel);
           mainTextArea=new JTextArea("");
           mainTextArea.setForeground(Color.WHITE);
           mainTextArea.setBackground(Color.BLACK);
           mainTextArea.setLineWrap(true);
           mainTextArea.setWrapStyleWord(true);
           mainTextArea.setFont(normalFont);
           maintextpanel.add(mainTextArea);

           x.setMainname(username);


           mainTextArea.setText(" "+x.display());


       }
   }
   public class choise1 implements ActionListener
   {
       public void actionPerformed(ActionEvent event)
       {
           gameScreen3();
       }
   }
   public class choise2 implements  ActionListener
   {
       public void actionPerformed(ActionEvent event)
       {
           gameScreen3();
       }
   }
   public void hp()
   {
       hp=character.stats[5];

       hplabelNumber.setText(" "+ hp);
   }
   public class confront implements ActionListener
   {
       public void actionPerformed(ActionEvent event)
       {
           x.addStat("c",+10);

           x();
       }
   }
   public void x()
   {
       maintextpanel5.setVisible(false);
       maintextpicture.setVisible(false);
       cat.setVisible(false);
       choiseButtonpanel.setVisible(false);


       maintextpanelconf=new JPanel();
       maintextpanelconf.setBounds(100,90,560,310);
       maintextpanelconf.setBackground(Color.black);
       con.add(maintextpanelconf);


       JTextArea textArea=new JTextArea(18,53);
       textArea.setText("“Hey!” you shout. The man tilts his head, still staring. “Whoever you are, I’m not afraid of you!”\n" +
               "The man smirks this time. He starts to walk closer to you, slowly. “I’ve finally found you. It has been a long time, brother.” he says.\n" +
               "You frown, gripping your briefcase tighter as he gets closer and closer. “Brother? I’m not your brother. I don’t have any.”\n" +
               "“Oh, you do.” he laughs. “How could you forget us?”\n " );

       textArea.setLineWrap(true);
       textArea.setWrapStyleWord(true);
       textArea.setBackground(Color.BLACK);
       textArea.setForeground(Color.WHITE);
       maintextpanelconf.add(textArea,BorderLayout.CENTER);
       next=new JPanel();
       next.setBounds(650,500 ,100,100);
       next.setBackground(Color.WHITE);
       next.setOpaque(false);
       con.add(next);
       nextbutton =new JButton("Next");
       nextbutton.setBackground(Color.getColor("Blue",135));
       nextbutton.setForeground(Color.WHITE);
       nextbutton.setFont( Playfont);
       nextbutton.setFocusPainted(false);
       nextbutton.setOpaque(false);
       next.add(nextbutton);
       nextbutton.addActionListener(next2x);

       maintextpicture=new JPanel();
       maintextpicture.setBounds(0,0,800,600);
       maintextpicture.setBackground(Color.DARK_GRAY);
       con.add(maintextpicture);
       mainpiclabel= new JLabel();
       img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
       mainpiclabel.setIcon(img2);
       maintextpicture.add(mainpiclabel);
       hp();


   }
   public class runaway implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            x.addStat("c",-10);

            y();
        }
    }
    public void y()
    {
        choiseButtonpanel.setVisible(false);
        maintextpanel5.setVisible(false);
        maintextpicture.setVisible(false);
        cat.setVisible(false);
        choiseButtonpanel.setVisible(false);


        maintextpanelrnw=new JPanel();
        maintextpanelrnw.setBounds(100,90,560,310);
        maintextpanelrnw.setBackground(Color.black);
        con.add(maintextpanelrnw);


        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("The moment the man takes a step towards you, you turn back and start running. You know that he is after you and this gives you a boost of adrenaline. He chases you through a couple of streets, until you are tackled to the ground from behind, the briefcase still in your hand. Your face hits the ground hard, making you shout in pain and try to squirm out of his strong grip around your legs. It is no use as he flips you over, punching you in the face. \n " );

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanelrnw.add(textArea,BorderLayout.CENTER);
        next=new JPanel();
        next.setBounds(650,500 ,100,100);
        next.setBackground(Color.WHITE);
        next.setOpaque(false);
        con.add(next);
        nextbutton =new JButton("Next");
        nextbutton.setBackground(Color.getColor("Blue",135));
        nextbutton.setForeground(Color.WHITE);
        nextbutton.setFont( Playfont);
        nextbutton.setFocusPainted(false);
        nextbutton.setOpaque(false);
        next.add(nextbutton);
        nextbutton.addActionListener(next2y);
        maintextpicture=new JPanel();
        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
        hp();


    }
    public class talk implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            x.addStat("i",+10);

            z();
        }
    }
    public void z()
    {
        choiseButtonpanel.setVisible(false);
        maintextpanel5.setVisible(false);
        maintextpicture.setVisible(false);
        cat.setVisible(false);
        choiseButtonpanel.setVisible(false);


        maintextpanelrnw=new JPanel();
        maintextpanelrnw.setBounds(100,90,560,310);
        maintextpanelrnw.setBackground(Color.black);
        con.add(maintextpanelrnw);


        JTextArea textArea=new JTextArea(18,53);
        textArea.setText("“Hey, look.” you start the sentence, lifting your hands in defence. “Whoever you are, we don’t have to fight at all. Please just leave me be!”\n" +
                "The man laughs, walking closer to you. “Just like that? I’m sorry, but no. I will stay right here and kill you with my bare hands.”\n" +
                "The man closes the gap between you two in a second and punches you in the face.\n" );

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        maintextpanelrnw.add(textArea,BorderLayout.CENTER);
        next=new JPanel();
        next.setBounds(650,500 ,100,100);
        next.setBackground(Color.WHITE);
        next.setOpaque(false);
        con.add(next);
        nextbutton =new JButton("Next");
        nextbutton.setBackground(Color.getColor("Blue",135));
        nextbutton.setForeground(Color.WHITE);
        nextbutton.setFont( Playfont);
        nextbutton.setFocusPainted(false);
        nextbutton.setOpaque(false);
        next.add(nextbutton);
        nextbutton.addActionListener(next2z);
        maintextpicture=new JPanel();
        maintextpicture.setBounds(0,0,800,600);
        maintextpicture.setBackground(Color.DARK_GRAY);
        con.add(maintextpicture);
        mainpiclabel= new JLabel();
        img2=new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Javaswing\\src\\pictures\\abc.jpg");
        mainpiclabel.setIcon(img2);
        maintextpicture.add(mainpiclabel);
        hp();


    }
    public class gms3nextx implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            maintextpanelconf.setVisible(false);

            gameScreen4x();



        }
    }
    public class gms3nexty implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {


            gameScreen4y();



        }
                }
public class gms3nextz implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {


        gameScreen4z();



    }
}
















}