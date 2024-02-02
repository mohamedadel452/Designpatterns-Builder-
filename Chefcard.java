/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author hp
 */
public abstract class Chefcard {
    
    Meal meal;

    public Chefcard() {
        meal=new Meal();
    }
    
    
    abstract void buildmaindash();
    abstract void buildfrize();
    abstract void builddrink();
    abstract Meal buildmeal();
   
    
}
