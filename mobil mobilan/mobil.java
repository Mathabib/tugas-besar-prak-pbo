import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class mobil extends Actor 
{
    /**
     * Act - do whatever the mobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i;
    abstract void cetak();
    abstract void maju();
    
    public void act()
    {
        maju();
        if(getY() == 599){
           getWorld().removeObject(this);
        } 
        
        
        
    }
}
