/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;


/**
 *
 * @author SALA I
 */
public class Medico {
    public String nombre;
    public String especialidad;
    public double sueldo;
    
    //constructor
    public Medico(String n, String c, double s){
        nombre = n ;
        especialidad = c;
        establecerSueldo(s);
       
    }
    // establecer
    public void establecerNombre(String n ){
        nombre = n;  
    }
    public void establecerEspecialidad(String n ){
        especialidad = n;  
    }
    public void establecerSueldo(double n ){
        sueldo = n;  
    }
    // obtener
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerEspecialidad(){
        return especialidad;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
}
