/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Ciudad {
    public String nombre;
    public String provincia;
    
    //constructor
    public Ciudad(String n, String c){
        nombre = n ;
        provincia = c;
    }
    // establecer
    public void establecerNombre(String n ){
        nombre = n;  
    }
    public void establecerProvincia(String n ){
        provincia = n;  
    }
    // obtener
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerProvincia(){
        return provincia;
    }
}
