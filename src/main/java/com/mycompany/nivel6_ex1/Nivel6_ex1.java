/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nivel6_ex1;

import java.util.Scanner;

/**
 *
 * @author nanre
 */
public class Nivel6_ex1 {

    // defino e ingreso manual del vector
    public static void main(String[] args) {
    
     int nume[] = new int [10];   
     Scanner teclado = new Scanner(System.in);
     
                  
    
     for (int i=0; i<10; i++){
     
     System.out.println("ingrese un numero para el vector " +i);
     System.out.println("-------------------------------------");
    
     nume[i]= teclado.nextInt();
   
    
    
       
    }
  }  
}


