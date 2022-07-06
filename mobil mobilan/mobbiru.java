import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobbiru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobbiru extends mobil implements kendaraan
{
    /**
     * Act - do whatever the mobbiru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int speed = 8;
   
    void cetak(){
        mobbiru mobil1 = new mobbiru();
        getWorld().addObject(mobil1,Greenfoot.getRandomNumber(249)+184,5);
        
    }
    void maju(){
        setLocation(getX(),getY()+ speed);
    }
    public void klakson(){
        i++;
        if(i >=100){
            Greenfoot.playSound("klakson.mp3");
            i = 0;
        }
    }
    public void act(){
        super.act();
        klakson();
        
    }
}
