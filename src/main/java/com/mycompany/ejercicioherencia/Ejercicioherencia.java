
package com.mycompany.ejercicioherencia;

import java.util.Scanner;

public class Ejercicioherencia {

    public static void main(String[] args) {


        DocenteHC1 d1 = new DocenteHC1(5, 3.5 , "juan" , "sistemas", "ingles");
        
        
        System.out.println("el sueldo del mes del docente1 es: ");
        System.out.println(d1.sueldomeshoras());
    
        
        DocenteTCO1 d2 = new DocenteTCO1(3 , 2500000 , "luis", "sistemas","fisica");{
        
        System.out.println("el sueldo del mes del docente2 es:");
        System.out.println(d2.calcularSueldoMensual());
        
    
    
        }
    }

}        
       