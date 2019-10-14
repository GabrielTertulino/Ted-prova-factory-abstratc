/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gabri
 */
public class PizzaioloPizzaPresunt extends Pizzaiolo {
     public PizzaioloPizzaPresunt() {
    }
    
    @Override
    public Calzones calzones(){
        return new Calzones_Presunto();
    }
    
    @Override
    public Pizza pizza(){
        return new Pizza_Presunto();
    
}
}
