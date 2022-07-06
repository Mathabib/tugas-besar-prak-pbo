import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobungu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobungu extends mobil implements kendaraan
{ 
    int speed = 5;
    void cetak(){
        mobungu mobil1 = new mobungu();
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
    /**
     * Act - do whatever the mobungu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
}
