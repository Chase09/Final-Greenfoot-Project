import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{

    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //getImage().scale(35,35);
        move();
        reachesEnd();
        touchesWater();
    }    

    /**
     * move - This makes it so when you use the arrow keys the frog moves
     * that way. Also it makes it so when you touch the log you stay on it.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void move()
    {

        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-1);          
        }

        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+1);
        }

        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1, getY());
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1, getY());
        }

        if(isTouching(Log.class) )
        {
            setLocation(getX() +1,getY());
        }
        if(isTouching(Log2.class) )
        {
            setLocation(getX() -1,getY());
        }
    }
    
    /**
     * reachesEnd - This makes it so when you reach the end you get the you win
     * text pop up on the world.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void reachesEnd()
    {
        if(getY() <= 30 ) 
        {
            getWorld().showText("YOU WIN!", getWorld().getWidth()/2, 60);
            Greenfoot.stop();
        }
    }

    /**
     * This makes it so when you touch the water you die and the gameover screen pops 
     * up but when your on the log or lillypad you dont.
     * 
     * @return Nothing is being returned
     * @param There are no parameters
     */
    private void touchesWater()
    {
        GameOver gameover = new GameOver();

        if(getY()>= 40 && getY()<= 190)
        {
            if(!isTouching(Log.class) && !isTouching(Log2.class) && !isTouching(LillyPad.class))  
            {
                getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2 -70);
                getWorld().removeObject(this);

            }

        }

    }
}
