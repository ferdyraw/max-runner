import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalD extends Actor
{
    private GreenfootImage[] imagesPortal= new GreenfootImage[8];
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int countPortal = 0;
    private int num = 1;
    private int countPortal1 = 0;
    public PortalD(){
        animPortal();
    }
    public void act()
    {
        Anim();
        setLocation(getX() - num, getY());
        if (getX() > 508){
            num = 1;
        } else {
            num = 5;
        } 
        // Add your action code here.
    }
    
    public void animPortal(){
        for(int i = 0; i < 8; i++){
            int a = i+1;
            String filename = "portal"+ a + ".png";
            imagesPortal[i] = new GreenfootImage(filename);   
        } 
    }
    public void Anim(){
        
        if(countPortal1 % 4 == 0 ){
        setImage(imagesPortal[countPortal++ %8]);
        
        }
        if(countPortal1 > 32){
            countPortal1 = 0;
        }
        countPortal1 ++;
    }
}
