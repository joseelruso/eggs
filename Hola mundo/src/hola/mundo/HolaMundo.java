/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
        System.out.println("hola mundo");
        System.out.println("cual es tu nombre");
        String nombre=leer.nextLine();
        System.out.println("edad");
        int edad=leer.nextInt();
        
        
        
        
        
    }
    
}
