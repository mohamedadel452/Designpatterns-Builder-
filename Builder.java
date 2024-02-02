/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder;

/**
 *
 * @author hp
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Chefcard c1=new Kidscard();
        Chefcard c2=new BigmacCard();
        
        Casher c=new Casher(c2);
        c.ordermeal();
        Meal m =c.getmeal();
        System.out.println("Hallo i am Casher and this is your meal nmae "+m.getMaindash()+"\n and this is your drink :"+ m.getDrink());
        
        
        
        
        
        
        
        
    }
    
}
