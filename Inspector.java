import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Inspector Class checks whether the inserted coin is Real Quarter or Fake Quarter or Penny.
 * When FakeQuarter or Penny gets inserted, to display message with no gumball.
 * When Real Quarter is detected, Inspector will call to the choosen gumball picker to display gumball. 
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class Inspector extends Alien
{
    // To declare coin actor to get coin object
    private Actor coin=null;    
    // To declare List for picker class
    private List<Picker> picker;         
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // To check coin is not having null value 
        if(coin != null)            
        {
            World world = getWorld() ;
            // To get Objects of Picker class
            picker = world.getObjects(Picker.class);      
            // Using RANDOMNUMBER function to choose a number
            int picknumber = Greenfoot.getRandomNumber(picker.size());
            // To get the picker object of the choosen number 
            Picker chosenalien = picker.get(picknumber);            
            
            // To Compare whether coin is Real Quarter
            if(coin.getClass() == Quarter.class)               
            {
                ((Message)world.getObjects(Message.class).get(0)).displayMessageBox(360,350,"Choosing Picker!");   
                //Polymorphism concept.Compiler will decide runtime to call randompicker's class or greenpicker's pick method.
                chosenalien.pick(); 
            }
            else if (coin.getClass() == FakeQuarter.class)  // To Compare whether coin is FakeQuarter
                
                ((Message)world.getObjects(Message.class).get(0)).displayMessageBox(360,350,"FakeQuarter Sir!");//Display message for invalid coin
            else
                ((Message)world.getObjects(Message.class).get(0)).displayMessageBox(360,350,"Insert Quarter Sir!");
         
            coin = null;
        }
    }   
    /**
     * Function to set coin object   
     */
    public void setCoin(Actor coin)
    {
        //copy coin object to local coin variable
        this.coin = coin;           
    }
}
