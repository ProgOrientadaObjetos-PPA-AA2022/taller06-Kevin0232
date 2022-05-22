/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class Enfermero {
    public String nombre;
    public String contrato;
    public double sueldo;
    
    //constructor
    public Enfermero(String n, String c, double s){
        nombre = n ;
        contrato = c;
        sueldo = s;
       
    }
    // establecer
    public void establecerNombre(String n ){
        nombre = n;  
    }
    public void establecerContrato(String n ){
        contrato = n;  
    }
    public void establecerSueldo(double n ){
        sueldo = n;  
    }
    // obtener
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerContrato(){
        return contrato;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
}
