import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobilutama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobilutama extends Actor implements tempur 
{
    int speed =5;
    int hitung =0 ;
    /**
     * Act - do whatever the mobilutama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void tembak(){
        hitung ++;
        if(hitung >= 15){
            Greenfoot.playSound("shoot.mp3");
            peluru1 ammo = new peluru1();
            getWorld().addObject(ammo,getX(),getY());
            hitung = 0;
        }
    }
    void klakson(){
        Greenfoot.playSound("klakson.mp3");
    }
    public void hancur(){
        Greenfoot.playSound("tabrakan.mp3");
                getWorld().removeObject(this);
                Greenfoot.stop();
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
        }
        
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 185){
                setLocation(getX()-speed,getY());
            }
        }else if(Greenfoot.isKeyDown("right")){
                 if(getX()<= 439){
                     setLocation(getX()+speed,getY());
                 }
            }
            if(Greenfoot.isKeyDown("space")){
                tembak();
            }
            
            if(isTouching(mobungu.class)){
                Greenfoot.playSound("tabrakan.mp3");
               live.add(1);
               removeTouching(mobungu.class);
                
            }
            else if(isTouching(mobbiru.class)){
                Greenfoot.playSound("tabrakan.mp3");
                live.add(1);
                removeTouching(mobbiru.class);
               
            }
            else if(isTouching(peluru2.class)){
                live.add(1);
                Greenfoot.playSound("tabrakan.mp3");
                removeTouching(peluru2.class);
                
            }
            if(live.value ==0){
                
                gameover tulisan = new gameover();
                getWorld().addObject(tulisan,314,292);
                Greenfoot.playSound("gameover.mp3");
                hancur();
            }
            if(Counter2.value >= 2 && Counter.value >=2){
                youwin menang = new youwin();
                getWorld().addObject(menang,314,292);
                Greenfoot.playSound("youwin.mp3");
                Greenfoot.stop();
            }
            

    }
}
