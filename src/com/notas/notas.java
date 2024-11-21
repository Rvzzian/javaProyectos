/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.notas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class notas {
   public static void main (String[] args){
   Scanner teclado = new Scanner(System.in);
   float sumaNotas = 0 ;
   int contador = 1; 
   float[] notas = new float[5];
   float promedio ;
    
        for(int i = 0; i < notas.length; i++){
         System.out.println("escribe la nota # " + contador);
         float notaIns ;
         notaIns = teclado.nextFloat();
         notas[i] = notaIns;
         contador++;
//   
         }

        for (int i = 0; i < notas.length;i++ ){
          System.out.println("estas son tus notas : "+notas[i]);
          sumaNotas = sumaNotas + notas[i];
        }
        promedio = (sumaNotas/notas.length);
        
     
        
        if(promedio <= 2){
            System.out.println("perdio la materia con un promedio de  "+ promedio);
        }else if (promedio > 2.1 && promedio < 2.9){
            System.out.println("la asignatura puede ser habilitada " + promedio);
        }else if (promedio > 2.9 && promedio <= 5){
            System.out.println("pasaste la matereia con un promedio de " + promedio);
        }else{
            System.out.println("hay un error verifica las notas ");
        }
    }
}
