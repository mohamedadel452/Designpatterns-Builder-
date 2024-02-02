/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author hp
 */
public class BigmacCard extends Chefcard{

    @Override
    void buildmaindash() {
        
        meal.setMaindash("bigmac");
    }

    @Override
    void buildfrize() {
        
        meal.setFriez(" hot frize ");
    }

    @Override
    void builddrink() {
        meal.setDrink("hot drink ");
        
    }

    @Override
    Meal buildmeal() {
        
        return meal;
    }
    
    
}
