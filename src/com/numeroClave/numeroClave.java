/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numeroClave;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class numeroClave {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    
     int a = 0;
     int b = 16;
     int errores = 0 ;
     System.out.println("escribala clave ");
     a = teclado.nextInt();
     
     while (a!=b){
         System.out.println("clave incorrecta intentelo nuevamente");
         a = teclado.nextInt();
         errores ++;
     }
    System.out.println("codigo correcto ");     
    System.out.println("errorres cometidos "+errores);
    teclado.close();
    }
    
}
