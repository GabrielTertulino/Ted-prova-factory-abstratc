/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.util.Scanner;
import modelo.Pizzaiolo;

/**
 *
 * @author gabri
 */
public class Cliente {
    public Cliente(){
        
    }
     public static void main(String args[]){
         System.out.println("-=-=-=-=-=-=-=-Pizzaria-=-=-=-=-=-=-=-");
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("informe a data para conhecer os sabores de hoje('dd/mm/aaaa'): ");
    String data = entrada.next();
    
    Pizzaiolo pizzaiolo = Pizzaiolo.pizzaiolo(data);
    System.out.println(pizzaiolo.pizza().ingredientes());
    System.out.println(pizzaiolo.calzones().ingredientes());
     }
         
     }
    
    

