/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejemplo31 {
     public static void main(String[] args) {
        // Se crea un Scanner para ingresar datos
        Scanner entrada = new Scanner(System.in);
        // Se crea el arreglo datos como entero hasta el rango 5
        int[] datos = new int[6];
        // Se crea el arreglo rangos como cadena ingresando variables
        String[] rangos = {"0-8", "8.1-12", "12.1-16","16.1-19","19.1-20",
            "20.1-adelante"};
        // Se crea una variable bandera como true
        boolean bandera = true;
        // Se crea un ciclo while
    while ( bandera == true){
        // Se pide al usuario que ingrese notas
        System.out.println("Ingrese sus notas");
        double notas = entrada.nextDouble();
        // Se crea un condicional If para comparar los valores y si cumplen las 
        //condiciones se les asigna un valor
       if(notas <=8){
            datos[0] = datos[0] + 1;
        }else{
            if(notas>=8.1 && notas <=12){
                datos[1] = datos[1] + 1;
            }else{
                if(notas>=12.1 && notas <=16){
                    datos[2] = datos[2] + 1;
                }else{
                    if(notas>=16.1 && notas <=19){
                        datos[3]= datos[3] + 1;
                    }else{
                        if(notas>=19.1 && notas <=20){
                            datos[4] = datos[4] + 1;
                        }else{
                            datos[5] = datos[5] + 1;
                        }
                    }
                }
            }
        }
        // Se limpia el bucle 
        entrada.nextLine();
        // Se pregunta al usuario si desea continuar 
            System.out.println("Ingrese 1 para salir o cualquier otro"
                    + " numero para continuar ");
            String op = entrada.nextLine();
            if (op.equals("1")){
                bandera = false;
            }
        }
        //Se presenta los resultados
        System.out.println("Resultados");
        
        for(int i = 0; i<datos.length; i++){
            System.out.printf("Notas de %s - %d\n", rangos[i], datos[i]);
        }
    }  
}
