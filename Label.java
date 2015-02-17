import greenfoot.*;

/**
 * Label class is used for labelling object which are present in the world.
 * 
 * @author - HARDIK GANDHI 
 * @date - 02/03/2015
 */
public class Label extends Actor
{
    /**
     * Label Class constructor for initizaling image and putting text in image.
     */
    public Label(String name)
    {
        GreenfootImage img = new GreenfootImage (name.length()*10,30);
        img.drawString(name, 2,20);
        setImage(img);
    }
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }     
}
