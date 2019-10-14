/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author gabri
 */



public abstract class Pizzaiolo {
    
    public static Pizzaiolo pizzaiolo(String data) throws PizzariaCloseException{
        
        SimpleDateFormat dataDoPedido = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();
       
        try {
            calendario.setTime(dataDoPedido.parse(data));
        } catch (ParseException ex) {
           
        }
        
        switch(calendario.get(Calendar.DAY_OF_WEEK)){
            
            case Calendar.MONDAY: return new PizzaioloPizzaCalab();
            case Calendar.WEDNESDAY: return new PizzaioloPizzaCalab();
            case Calendar.FRIDAY: return new PizzaioloPizzaCalab();
            case Calendar.TUESDAY: return new PizzaioloPizzaPresunt();
            case Calendar.THURSDAY: return new PizzaioloPizzaPresunt();
            case Calendar.SATURDAY: return new PizzaioloPizzaPresunt();
            case Calendar.SUNDAY:  throw new PizzariaCloseException("Não abrimos aos domingos!");
            default: 
              throw new PizzariaCloseException("Não abrimos aos domingos!");
        }    
     
    }    
   

  public abstract Calzones calzones();

  
  public abstract Pizza pizza();
    
    }