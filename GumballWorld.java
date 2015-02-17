import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GumballWorld class is used for creating and adding objects(Gumballmachine, gumball,
 * RandomPicker, GreenPicker, coins,Inspector) to the world.
 * Labelling all objects which are present in the world.
 * 
 * @author - HARDIK GANDHI
 * @date - 02/03/2015
 */
public class GumballWorld extends World
{
    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Adding GumballMachine to the world
        addObject(new GumballMachine(), 199, 250);
        // Creating Label for Gumball Machine 
        Label label = new Label("GumBall Machine");    
        // Adding GumballMachine label
        addObject(label,220,450);     
        
        // Adding Penny to the world
        addObject( new Penny(), 92, 527 ) ;
        // Adding label for Penny 
        addObject(new Label("Penny"),100,575);  
        // Adding Quarter to the world
        addObject( new Quarter(), 213, 522 ) ;   
        // Adding label for Quarter
        addObject(new Label("Quarter"),220,575);  
        // Adding FakeQuarter to the world
        addObject( new FakeQuarter(), 339, 523 ) ; 
        // Adding label for Fakequarter
        addObject(new Label("Fake Quarter"),360,575);  
        // creating second object of Quarter
        Quarter quarter2 = new Quarter();   
        // Adding second object of Quarter to the world
        addObject(quarter2, 157, 426);                         
        quarter2.setLocation(458, 524);
        // Adding label for Quarter
        addObject(new Label("Quarter"),470,575);               
                
        // Adding Inspector to the world
        addObject(new Inspector(), 358, 229);
        // Adding label for Inspector
        addObject(new Label("Inspector"),380,325);
        
        // creating randompicker object
        RandomPicker randompicker = new RandomPicker();
        // Adding randompicker to the world
        addObject(randompicker, 93, 413);
        randompicker.setLocation(569, 313);
        // Adding label for RandomPicker
        addObject(new Label("RandomPicker"),586,410);
        
        // creating Greenpicker object       
        GreenPicker greenpicker = new GreenPicker();
        // Adding Greenpicker to the world
        addObject(greenpicker, 351, 415);
        greenpicker.setLocation(563, 87);
        // adding label for Greenpicker
        addObject(new Label("GreenPicker"),580,180);
       
        // adding message to the world
        addObject(new Message(),-1,-1);
    }   
}
