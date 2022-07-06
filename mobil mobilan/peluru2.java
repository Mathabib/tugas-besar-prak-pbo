import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru2 extends Actor
{
    peluru2(){
        setImage("bullet.png");
    }
    public void act()
    {
       setLocation(getX(),getY()+10);
        
        if(getY() >= 599){
            getWorld().removeObject(this);
        }
    }
}
