import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen. This method shows a text
     * that says "press space to start."
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("press space to start",getWidth()/2,390);
        Greenfoot.start();
    }
    /**
     * This makes it so when you press the space bar the game starts.
     * 
     * @return Nothing is being retuned
     * @param There are no parameters
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new FroggerWorld());
        }
    }
}
