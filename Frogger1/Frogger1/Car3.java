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

    private void move()
    {
        move(-1);
    }

    private void atEdge()
    {
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }

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
