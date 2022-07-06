import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class newworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class newworld extends World
{

    /**
     * Constructor for objects of class newworld.
     * 
     */
    public newworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    GreenfootSound suaramobil = new GreenfootSound("mobil.mp3");
    private void prepare()
    {
        mobungu mobungu = new mobungu();
        addObject(mobungu,223,214);
        mobilutama mobilutama = new mobilutama();
        addObject(mobilutama,184,568);
        mobilutama.setLocation(188,570);
        mobilutama.setLocation(439,558);
        mobungu.setLocation(184,208);
        mobungu.setLocation(435,204);
        mobungu.setLocation(433,204);

        Counter counter = new Counter("bintang :");
        addObject(counter,74,37);
        Counter2 counter2 = new Counter2("corona :");
        addObject(counter2,527,35);
        live live = new live("nyawa :");
        addObject(live,78,577);
        
    }

    public void act(){
        if(Greenfoot.getRandomNumber(300)<1){
            
        addObject(new bintang(),Greenfoot.getRandomNumber(249)+184,5);
       }
        suaramobil.playLoop();
         if(Greenfoot.getRandomNumber(200)<1){
            
        addObject(new mobungu(),Greenfoot.getRandomNumber(249)+184,5);
       }
       
       if(Greenfoot.getRandomNumber(200)<1){
            
        addObject(new mobbiru(),Greenfoot.getRandomNumber(249)+184,5);
       }
       
        if(Greenfoot.getRandomNumber(300)<1){
            
        addObject(new corona(),Greenfoot.getRandomNumber(249)+184,5);
       }
    }
}
