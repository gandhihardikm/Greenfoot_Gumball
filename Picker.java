import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Picker class is defined as Abstract and inheriting Alien Class.
 * pick() method of this class is declared as a abstract method.
 * So any class inheriting Picker class must declare pick() method in it.
 * 
 * @author - HARDIK GANDHI 
 * @date - 02/03/2015
 */
public abstract class Picker extends Alien
{
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    //Defining pick() method as a abstract to gain advantage of Polymorphism
    abstract void pick();
}
