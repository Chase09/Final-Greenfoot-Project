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
        reachesEnd();
        move();
        touchWater();
    }    

    private void move()
    {
        if(isTouching(Log.class) )
        {
            setLocation(getX() +1,getY());
        }
        
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
    }

    private void reachesEnd()
    {
        if(getY() <= 30 ) 
        {
            getWorld().showText("You have beat the game!",getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }

    private void touchWater()
    {
        GameOver gameover = new GameOver();

        if(getY()>= 100 && getY()<= 190)
        {
            if(!isTouching(Log.class))  
            {
                getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2 -70);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else if(!isTouching(LillyPad.class))
            {
                getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2 -70);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
        }
    }

}
