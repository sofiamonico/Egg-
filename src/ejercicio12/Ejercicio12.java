/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import PersonaEntidades.Persona;

/**
 *
 * @author Leandro
 */
public class Ejercicio12 {

    public static void main(String[] args) {
       Persona p1 = new Persona();
       
       p1.crearPersona();
        System.out.println(p1.calcularEdad());
        System.out.println(p1.menorQue(35));
       p1.mostrarPersona();
    }
    
}
