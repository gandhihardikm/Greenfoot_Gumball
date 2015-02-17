import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gumball class is inherited from Actor. Inherit all the properties and attributes of Actor class.
 * Initialize Gumball Image in the constructor of the class.
 * 
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class Gumball extends Actor
{
    /**
     * Gumball Constructor 
     */
    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;    //Initialize Image for Gumball
    }

    public void act() 
    {
        
    }    
}
