/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author hp
 */
public class Casher {
    
    
    Chefcard chefcard;

    public Casher(Chefcard chefcard) {
        this.chefcard = chefcard;
    }
    
    public void ordermeal(){
        
        chefcard.builddrink();
        chefcard.buildfrize();
        chefcard.buildmaindash();
    }
    
    public Meal getmeal(){
        
       return chefcard.buildmeal();
    }
    
    
    
}
