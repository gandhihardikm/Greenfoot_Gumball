import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * FakeQuarter class is inherited from Quarter. Inherit all the properties and attributes of Quarter class.
 * Initialize FakeQuarter Image in the constructor of the class.
 * 
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class FakeQuarter extends Quarter
{
    /**
     * FakeQuarter Class contructor - to initialize Fakequarter image
     */
    public FakeQuarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ; 
    }  
}
