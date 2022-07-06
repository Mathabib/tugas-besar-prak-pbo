import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bintang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bintang extends Actor
{
    bintang(){
        setImage("point.png");
    }
    void hilang(){
        Counter.add(1);
        Greenfoot.playSound("point.mp3");
        getWorld().removeObject(this);
    }
    int speed = 5;
    public void act()
    {
        setLocation(getX(), getY()+speed);
        if(getY() == 599){
            getWorld().removeObject(this);
        }
        else if(isTouching(mobilutama.class)){
            hilang();
        }
    }
}
