/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author hp
 */
public class Kidscard extends Chefcard{

    @Override
    void buildmaindash() {
       meal.setMaindash("kidsberger");
    }

    @Override
    void buildfrize() {
       meal.setFriez("duck shape frize ");
    }

    @Override
    void builddrink() {
       meal.setDrink("orange juice");
    }

    @Override
    Meal buildmeal() {
        
        return meal;
       
    }
    
}
