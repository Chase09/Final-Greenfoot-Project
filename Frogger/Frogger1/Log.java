import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends Actor
{
    /**
     * Act - do whatever the log wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        atEdge();
    }    

    private void move()
    {
        move(1);
    }

    private void atEdge()
    {
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
}
