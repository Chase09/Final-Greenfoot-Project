import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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

        addObject(new Log(),0, 190);
        addObject(new Log(),50, 120);
        addObject(new Log(),0, 50);
        addObject(new Log(),100, 190);
        addObject(new Log(),150, 120);
        addObject(new Log(),100, 50);
        addObject(new Log(),200, 190);
        addObject(new Log(),250, 120);
        addObject(new Log(),200, 50);
        addObject(new Log(),300, 190);
        addObject(new Log(),350, 120);
        addObject(new Log(),300, 50);
        addObject(new Log(),400, 190);
        addObject(new Log(),450, 120);
        addObject(new Log(),400, 50);
        addObject(new Log(),500, 190);
        addObject(new Log(),550, 120);
        addObject(new Log(),500, 50);
        addObject(new Log(),600, 190);
        addObject(new Log(),600, 50);

        addObject(new LillyPad(),100,145);
        addObject(new LillyPad(),100,75);
        addObject(new LillyPad(),200,145);
        addObject(new LillyPad(),200,75);
        addObject(new LillyPad(),300,145);
        addObject(new LillyPad(),300,75);
        addObject(new LillyPad(),400,145);
        addObject(new LillyPad(),400,75);
        addObject(new LillyPad(),500,145);
        addObject(new LillyPad(),500,75);
        addObject(new LillyPad(),600,145);
        addObject(new LillyPad(),600,75);
        addObject(new LillyPad(),100,100);
        addObject(new LillyPad(),200,100);
        addObject(new LillyPad(),300,100);
        addObject(new LillyPad(),400,100);
        addObject(new LillyPad(),500,100);
        addObject(new LillyPad(),600,100);
        addObject(new LillyPad(),100,170);
        addObject(new LillyPad(),200,170);
        addObject(new LillyPad(),300,170);
        addObject(new LillyPad(),400,170);
        addObject(new LillyPad(),500,170);
        addObject(new LillyPad(),600,170);
        
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
        addObject(new Log(),0, 190);
    }

    private void Log2()
    {
        addObject(new Log(),0, 50);
    }

    private void Log3()
    {
        addObject(new Log(),50, 120);
    }

    public void act()
    {
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

    }
}
