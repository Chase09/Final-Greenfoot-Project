import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car3 extends Actor
{
    /**
     * Act - do whatever the Car3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //getImage().scale(60,60);
        move();
        checkForFrogs();
        atEdge();
    }   
    
    /**
     * move - This makes the car move left in the world.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void move()
    {
        move(-1);
    }
    
    /**
     * atEdge - This makes it so when the car reaches the edge
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

    /**
     * This makes it so when the car is touching the frog the frog 
     * gets removed from the world. Then the gameover screen pops up.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void checkForFrogs()
    {
        if(isTouching(Frog.class)==true)
        {
            removeTouching(Frog.class);
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2 -70);
            
        }
    }
}
