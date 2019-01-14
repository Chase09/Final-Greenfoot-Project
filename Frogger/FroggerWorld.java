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

        addObject(new log(),0, 190);
        addObject(new log(),0, 120);
        addObject(new log(),0, 60);
        addObject(new log(),150, 190);
        addObject(new log(),150, 120);
        addObject(new log(),150, 60);
        addObject(new log(),300, 190);
        addObject(new log(),300, 120);
        addObject(new log(),300, 60);
        addObject(new log(),450, 190);
        addObject(new log(),450, 120);
        addObject(new log(),450, 60);
        addObject(new log(),600, 190);
        addObject(new log(),600, 120);
        addObject(new log(),600, 60);

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
    }
}
