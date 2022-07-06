import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru1 extends Actor
{
    peluru1(){
        setImage("bullet.png");
    }
    public void act()
    {
        setLocation(getX(),getY()-10);
        
        if(getY() <= 5){
            getWorld().removeObject(this);
        }
    }
}
