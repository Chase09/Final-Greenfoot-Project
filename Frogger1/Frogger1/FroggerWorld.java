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
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    /**
     * Constructor for objects of class CopyOfFroggerWorld.
     * 
     */
    public FroggerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Frog(),getWidth()/2,520);

        addObject(new Car(),0, 300);
        addObject(new Car(),100, 300);
        addObject(new Car(),200, 300);
        addObject(new Car(),300, 300);
        addObject(new Car(),400, 300);
        addObject(new Car(),500, 300);
        addObject(new Car(),600, 300);

        addObject(new Log(),0, 195);
        addObject(new Log(),0, 120);
        addObject(new Log(),0, 165);
        addObject(new Log(),0, 75);
        addObject(new Log(),100, 195);
        addObject(new Log(),100, 120);
        addObject(new Log(),100, 165);
        addObject(new Log(),100, 75);
        addObject(new Log(),200, 195);
        addObject(new Log(),200, 120);
        addObject(new Log(),200, 165);
        addObject(new Log(),200, 75);
        addObject(new Log(),300, 195);
        addObject(new Log(),300, 120);
        addObject(new Log(),300, 165);
        addObject(new Log(),300, 75);
        addObject(new Log(),400, 195);
        addObject(new Log(),400, 120);
        addObject(new Log(),400, 165);
        addObject(new Log(),400, 75);
        addObject(new Log(),500, 195);
        addObject(new Log(),500, 120);
        addObject(new Log(),500, 165);
        addObject(new Log(),500, 75);
        addObject(new Log(),600, 195);
        addObject(new Log(),600, 75);
        addObject(new Log(),600, 120);
        addObject(new Log(),600, 165);

        addObject(new Button(),50,380);

        addObject(new LillyPad(),100,145);
        addObject(new LillyPad(),100,50);
        addObject(new LillyPad(),200,145);
        addObject(new LillyPad(),200,50);
        addObject(new LillyPad(),300,145);
        addObject(new LillyPad(),300,50);
        addObject(new LillyPad(),400,145);
        addObject(new LillyPad(),400,50);
        addObject(new LillyPad(),500,145);
        addObject(new LillyPad(),500,50);
        addObject(new LillyPad(),600,145);
        addObject(new LillyPad(),600,50);
        addObject(new LillyPad(),100,100);
        addObject(new LillyPad(),200,100);
        addObject(new LillyPad(),300,100);
        addObject(new LillyPad(),400,100);
        addObject(new LillyPad(),500,100);
        addObject(new LillyPad(),600,100);
        addObject(new LillyPad(),100,182);
        addObject(new LillyPad(),200,182);
        addObject(new LillyPad(),300,182);
        addObject(new LillyPad(),400,182);
        addObject(new LillyPad(),500,182);
        addObject(new LillyPad(),600,182);

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
        addObject(new Log(),0, 195);
    }

    private void Log2()
    {
        addObject(new Log(),0, 75);
    }

    private void Log3()
    {
        addObject(new Log(),0, 120);
    }

    private void Log4()
    {
        addObject(new Log(),0, 165);
    }

    public void act()
    {
        boolean isAllLetters = true;
        String username;
        do
        {
            username = JOptionPane.showInputDialog(null,"Please enter your initials:");
            
            for( int i = 0; i < username.length(); i++ )
            {
                if( Character.isLetter( username.charAt(i) ) == false )
                {
                    isAllLetters = false;
                }
            }
        } while( isAllLetters == false );
        
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
