import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    /**
     * GameOver - This makes the image bigger on the screen
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    public GameOver()
    {
        getImage().scale(300,300);
    }
}
