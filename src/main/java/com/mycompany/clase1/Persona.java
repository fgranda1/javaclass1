/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1;

/**
 *
 * @author fgranda
 */
public class Persona {
    String nombre;
    String apellido;
    int edad;
    double salario;
    float retefuente;
    
    void imprimir(){
        System.out.println(
                "----------------" +
                "\nNombre: " + this.nombre +
                "\nApellido: " + this.apellido + 
                "\nEdad: "+ this.edad + 
                "\nSalario: " + this.salario +
                "\nRetefuente: "+ this.calcularretefuente()
        );
    }
    double calcularretefuente(){
        double calculo;
        calculo = this.salario * 0.04;
        this.retefuente = (float)calculo;
        return calculo;
    }
}


