import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * GreenPicker class ejects Greengumball as requested by Inspector.
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
    /**
     * Pick() Method eject Greengumball and gets message object 
     * from the world to call displayMessageBox.
     */
    public void pick()
    {
         // Getting world object
         World world = getWorld();
         // Adding Gumball to the world
         GreenGumball gb = new GreenGumball();
         world.addObject(gb, 700, 130);
         // Getting Message object from World
         Message msg = ((Message)world.getObjects(Message.class).get(0));
         msg.displayMessageBox(700, 80, "Green Gumball Sir!!!"); 
         Greenfoot.delay(10);
         world.removeObject(gb);
    }
}
