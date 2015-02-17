import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * RandomPicker Class will use random function to select random number and 
 * accordingly eject gumball as requested by Inspector.
 * 
 * @author - HARDIK GANDHI 
 * @date - 02/03/2015
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
    }    
    /**
     * Pick() Method gets message object from the world to call displayMessageBox.
     * Use RandomNumber function to eject RedGumball or BlueGumball or GreenGumball. 
     */
    public void pick()
    {
        World world = getWorld();
        // Using RandomNumber function to get a number
        int number = Greenfoot.getRandomNumber(3);
        
        switch(number)
        {
                // adding RedGumball to the world 
            case 0:world.addObject(new RedGumball(), 700, 350);
                   break;  
                // adding BlueGumball to the world
            case 1:world.addObject(new BlueGumball(), 700, 350);
                   break;
                // adding GreenGumball to the world
            case 2:world.addObject(new GreenGumball(), 700, 350);
                   break;   
        } 
        // To get Message object from world 
        Message msg = ((Message)world.getObjects(Message.class).get(0));
        // To display Gumball Message
        msg.displayMessageBox(700, 300, "Gumball Sir!!!");
        
    }
}
