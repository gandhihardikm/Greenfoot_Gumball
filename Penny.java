import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Penny class is inherited from Coin. Inherit all the properties and attributes of coin class.
 * Initialize Penny Image in the constructor of the class.
 * 
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class Penny extends Coin
{   
    /**
     * Penny Class Constructor - to initialize Penny Image
     */
    public Penny()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;        
    }
}
