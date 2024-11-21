/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//este vas ser el nombre del paquete en el cual se alojara la clase Metodos
package com.metodos;

import java.util.Scanner;
// la clase debe llevar el nombre del archivo en el cual se esta trabajando este caso debe llamarse Metodos 
public class Metodos {
    // es declara los atributos 
    
    private Scanner teclado;
    private int cantidadNotas,c = 0;
    private float[] notas;
    private String nombre;
    private float suma, promedio = 0;
    
    public void ingreso() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese en numero la cantidad de notas que va a ingresar");
        cantidadNotas = teclado.nextInt();
        notas = new float[cantidadNotas]; 
          
    }
    
    
    public void verificacion (){
        for(int i = 0; i < notas.length;i++ ){
            System.out.println("escribe las notas");
            float notasIns ;
            notasIns = teclado.nextFloat();
            if(notasIns >= 0 && notasIns <= 5){
                notas[i] = notasIns; 
            }else{
            System.out.println("la nota que ingresaste no es valida intenta nuevamente ");
             break;
            }
            suma = suma + notas[i];
        }
        System.out.println(suma);
    }
    
    public void ganaOpierde(){
        
    
    }
    
    
    public static void main(String[] args) {
        Metodos persona1 = new Metodos();
        persona1.ingreso();
        persona1.verificacion();
    }
}
