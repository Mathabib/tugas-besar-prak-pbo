import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class corona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class corona extends Actor
{
    int speed = 5;
    int i ;
   void hancur(){
       Counter2.add(1);
       Greenfoot.playSound("corona_teriak.mp3");
       getWorld().removeObject(this);
       
   }
   
   void ketawa(){
       i++;
       if(i == 50){
           Greenfoot.playSound("ketawajahat2.mp3");
    
       }
   }
   void tembak(){
       i++;
       if(i==50){
           Greenfoot.playSound("laser_corona.mp3");
           peluru2 laser = new peluru2();
           getWorld().addObject(laser,getX(),getY());
           i = 0;
       }
   }
    public void act()
    {
         setLocation(getX(),getY()+ speed);
        // Add your action code here.
        if(getY() == 599){
           getWorld().removeObject(this);
        }
        else if(isTouching(peluru1.class)){
            hancur();
        }
        tembak();
        
        
        
    }
}
