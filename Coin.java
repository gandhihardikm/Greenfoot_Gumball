import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Coin class is inherited from Actor. Coin is inserted into the gumballmachine.
 * This class is resposible for changes in position of coin.
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class Coin extends Actor
{
    /**
    * Act - do whatever the Label wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.  
    * Coin movement is handled by this method. It fetches X,Y co-ordinate of mouse and 
    * set the coin to the location.
    */
   
    public void act() 
    {
        int mouseX, mouseY ;
        // Condition checks that Mousedragged event has occured with coin class object in it. 
        if(Greenfoot.mouseDragged(this)) 
        {          
            // Mouse object initialize with MouseInfo()
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();         //Fetches X co-ordinate
            mouseY=mouse.getY();         //Fetches Y co-ordinate
            setLocation(mouseX, mouseY); 
        }     
    }    
}
