import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Message class has a method displayMessageBox() which display Message to the world.
 * @author - HARDIK GANDHI
 * @date - 02/03/2015 
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {}
    /**
     * displayMessageBox method display Message for the User. Input parameter - Location to display message i.e x,y; 
     */
    public void displayMessageBox(int x,int y,String text)
    {
        World world = getWorld();
        // Initializing GreenfootImage 
        GreenfootImage img = new GreenfootImage(160,50);
        // Setting Font Color
        img.setColor( java.awt.Color.BLACK ) ;
        // Setting Font Size
        img.setFont(img.getFont().deriveFont(18F));
        img.drawString( text, 0, 35);
        Message msg = new Message();
        msg.setImage(img); 
        // Adding Message object to the world
        world.addObject( msg, x, y ) ;
        // Putting delay so that Message will disappear after specified time
        Greenfoot.delay(500);
        // Removing Message object from the world
        world.removeObject(msg);
    }
}
