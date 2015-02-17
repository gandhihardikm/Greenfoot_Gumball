import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * GumballMachine is resposible for taking a coin. Once coin is inserted crank should get turned on click & pass the coin to inspector.
 * If crank is turned without inserting a coin then GumballMachine display a alert message to the user.
 * Two coins are not allowed to insert at a time.
 * 
 * @author - HARDIK GANDHI
 * @date -  02/03/2015
 */
public class GumballMachine extends Actor
{
    // To check whether coin is inserted or not
    private boolean coin_inserted=false;   
    // To store coin (which is inserted by User)
    private Actor coin=null;               
   /**
    * Gumball Machine Constructor 
    */
   public GumballMachine()
   {
        GreenfootImage image = getImage() ;
        // To initialize size of GumballMachine 
        image.scale( 350, 380 ) ;           
   }
   /**
    * Act - do whatever the Label wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    * Coin will be inserted & upon click, Crank will Turned.   
    */
   public void act() 
   {
        // Initialize World object to fetch other objects added to the world
        World world = getWorld();  
        // Declare "Message" class object
       
        Message message;     
        // Check whether coin is already inserted or not. If coin_inserted=false, condition gets true
        if(!coin_inserted)        
        {
            // Returning coin object (inserted by User)
            coin = getOneObjectAtOffset( 0,0,Coin.class ) ; 
            // Condition gets true when coin object doesn't have null value
            if ( coin != null )                             
            {
                world.removeObject( coin ) ;      
                // Getting Message object from World class
                message = ((Message)world.getObjects(Message.class).get(0)); 
                // calling Method defined in Message class to display message
                message.displayMessageBox(215,35,"Have coin!!!"); 
                // To set coin_inserted flago
                coin_inserted = true;                                   
            }
        }       
        // Condition satisfy when Mouse gets Pressed 
        if(Greenfoot.mousePressed(this))                      
        {   
            // Gets executed when coin is in GumballMachine
            if(coin_inserted)                               
            {
                message = ((Message)world.getObjects(Message.class).get(0));
                // Calling Display message method in Message class
                message.displayMessageBox(215,35,"Crank Turned!!!");    
                // Setting coin object in Inspector class
                ((Inspector)world.getObjects(Inspector.class).get(0)).setCoin(coin);  
                // To unset coin_inserted flag.
                coin_inserted = false;                                  
            }
            else            //This block will execute when clicking on crank turned without inserting coin
            {
                message = ((Message)world.getObjects(Message.class).get(0));
                // Calling Display message method in Message class
                message.displayMessageBox(215,35,"Insert coin!!!");     
            }
        }     
    }    
}








