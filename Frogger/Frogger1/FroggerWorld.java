import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class CopyOfFroggerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FroggerWorld extends World
{
    
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;

    private boolean isAllLetters = true;

    private String username;
    
    private int[] lX = new int[]{100, 100, 100, 100, 200, 200, 200, 200, 300, 300, 300, 300, 400, 400, 400, 400, 500, 500, 500, 500, 600, 600, 600, 600};
    private int[] lY = new int[]{50, 95, 140, 178,50, 95, 140, 178,50, 95, 140, 178,50, 95, 140, 178,50, 95, 140, 178,50, 95, 140, 178,};
    /**
     * Constructor for objects of class CopyOfFroggerWorld. This method adds all the
     * objects to the world such as, log, car, frog,etc. it also makes sure
     * that when you put your name in at the start there can only be letters.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     * 
     */
    public FroggerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        setPaintOrder(GameOver.class);
        setPaintOrder(Frog.class);
        addObject(new Car(),0, 300);
        addObject(new Car(),100, 300);
        addObject(new Car(),200, 300);
        addObject(new Car(),300, 300);
        addObject(new Car(),400, 300);
        addObject(new Car(),500, 300);
        addObject(new Car(),600, 300);

        addObject(new Log2(),0, 195);
        addObject(new Log2(),0, 120);
        addObject(new Log(),0, 160);
        addObject(new Log(),0, 71);
        addObject(new Log2(),100, 195);
        addObject(new Log2(),100, 120);
        addObject(new Log(),100, 160);
        addObject(new Log(),100, 71);
        addObject(new Log2(),200, 195);
        addObject(new Log2(),200, 120);
        addObject(new Log(),200, 160);
        addObject(new Log(),200, 71);
        addObject(new Log2(),300, 195);
        addObject(new Log2(),300, 120);
        addObject(new Log(),300, 160);
        addObject(new Log(),300, 71);
        addObject(new Log2(),400, 195);
        addObject(new Log2(),400, 120);
        addObject(new Log(),400, 160);
        addObject(new Log(),400, 71);
        addObject(new Log2(),500, 195);
        addObject(new Log2(),500, 120);
        addObject(new Log(),500, 160);
        addObject(new Log(),500, 71);
        addObject(new Log2(),600, 195);
        addObject(new Log(),600, 71);
        addObject(new Log2(),600, 120);
        addObject(new Log(),600, 160);

        addObject(new Button(),50,380);

        showText("RESET", 50, 382);      
        
        addObject(new Car2(),600, 350);
        addObject(new Car3(),600, 250);
        addObject(new Car2(),500, 350);
        addObject(new Car2(),400, 350);
        addObject(new Car2(),300, 350);
        addObject(new Car2(),200, 350);
        addObject(new Car2(),100, 350);
        addObject(new Car3(),500, 250);
        addObject(new Car3(),400, 250);
        addObject(new Car3(),300, 250);
        addObject(new Car3(),200, 250);
        addObject(new Car3(),100, 250);

        addObject(new end(), 300, 15);

        addObject(new Frog(),getWidth()/2,520);
        addLillyPads();
        
        do
        {
            isAllLetters = true;
            username = JOptionPane.showInputDialog(null,"Please enter your name:");

            for( int i = 0; i < username.length(); i++ )
            {
                if( Character.isAlphabetic( username.charAt(i) ) == false )
                {
                    isAllLetters = false;
                }
            }
        } while( isAllLetters == false );
    }
    /**
     * This makes it so he lilly pads are on the screen when you play.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void addLillyPads()
    {
        for(int i = 0; i < lX.length; i++)
        {
            addObject(new LillyPad(),lX[i],lY[i]);
        }
    }

    private void car1()
    {
        addObject(new Car(),0, 300);
    }

    private void car2()
    {
        addObject(new Car2(),600, 350);
    }

    private void car3()
    {
        addObject(new Car3(),600, 250);
    }

    private void Log1()
    {
        addObject(new Log2(),600, 195);
    }

    private void Log2()
    {
        addObject(new Log(),0, 75);
    }

    private void Log3()
    {
        addObject(new Log2(),600, 120);
    }

    private void Log4()
    {
        addObject(new Log(),0, 160);
    }
    /**
     * This makes it so you can see your name you put in at the start in the bottom 
     * right corner. It also makes it so the cars and logs keep spawning in at the 
     * edge of the world.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    public void act()
    {
        showText( "Player: " + username, 450, 375);
        
        if(i == 100)
        {
            car1();
            i = 0;
        }
        else
        {
            i++;
        }
        if(j == 100)
        {
            car2();
            j = 0;
        }
        else
        {
            j++;
        }
        if(k == 100)
        {
            car3();
            k = 0;
        }
        else
        {
            k++;
        }
        if(k == 100)
        {
            Log1();
            k = 0;
        }
        else
        {
            k++;
        }
        if(j == 100)
        {
            Log2();
            j = 0;
        }
        else
        {
            j++;
        }
        if(i == 100)
        {
            Log3();
            i = 0;
        }
        else
        {
            i++;
        }
        if(m == 100)
        {
            Log4();
            m = 0;
        }
        else
        {
            m++;
        }
    }
}
