import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log2 extends Actor
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

    /**
     * move - This makes the Log move left in the world.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void move()
    {
        move(-1);
    }
    
    /**
     * atEdge - This makes it so when the Log reaches the edge
     * it gets removed from the world.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void atEdge()
    {
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
    
    
}
