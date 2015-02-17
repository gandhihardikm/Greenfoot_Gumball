import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Quarter class is inherited from Coin. Inherit all the properties and attributes of coin class.
 * Initialize Quarter Image in the constructor of the class.
 * 
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class Quarter extends Coin
{
    /**
     * Quarter Class Constructor - To initialize Quarter Image
     */
    public Quarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ;           
    } 
}
