/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class calculadora {
    
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
     
    double a;
    double b;
    
    System.out.println("ingrese el primer valor : ");
    a=teclado.nextInt();
    System.out.print("ingrese el segundo valor : ");
    b=teclado.nextInt();
    
    
    double multiplicacion = a*b;
    double suma = a+b;
    double resta = a-b;
    double division =(a/b);

    System.out.println("resultado de la multiplicacion : " + multiplicacion );
    System.out.println("resultado de la suma : " + suma );
    System.out.println("resultado de la resta : " + resta);
    System.out.println("resultado de la division : " + division);
    

    }
}
