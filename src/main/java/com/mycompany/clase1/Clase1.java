/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase1;

/**
 *
 * @author fgranda
 */
public class Clase1 {

    public static void main(String[] args) {
        Persona felipe = new Persona();
        felipe.nombre = "Felipe";
        felipe.apellido = "Granda";
        felipe.edad = 32;
        felipe.salario = 3000000;
        felipe.imprimir();
        
        Estudiante david = new Estudiante();
        david.nombre = "David";
        david.apellido = "Gomez";
        david.edad = 25;
        david.salario = 400000;
        david.nrc = "UV19293";
        david.imprimir();
        david.imprimirnrc();
    }
}
