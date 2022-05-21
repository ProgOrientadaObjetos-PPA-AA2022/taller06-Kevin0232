/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Ciudad;

/**
 *
 * @author SALA I
 */
public class Hospitales {
    private String nombreH;
    private Ciudad ciudadH;
    private int especialidades;
    private Medico[] medH;
    private Enfermero[] enfH;
    private double sueldoH;
    private String dirH;
    
    
    
    
    // Establecer
    public void establecerNombre(String n){
        nombreH = n;
    }
    public void establecerCiudad(Ciudad c){
        ciudadH = c;
    }
    public void establecerEspecialidades(int e){
        especialidades = e;
    }
    public void establecerMedicos(Medico[] m){
        medH = m;
    }
    public void establecerEnfermeros(Enfermero[] m){
        enfH = m;
    }
    public void establecerSueldo(double c){
        sueldoH = c;
    }
    public void establecerDir(String c){
        dirH = c;
    }
    
    //Obtener
    public String obtenerNombre(){
        return nombreH;
    }
    public Ciudad obtenerCiudad(){
        return ciudadH;
    }
    public int obtenerEspecialidad(){
        return especialidades;
    }
    public Medico[] obtenerMedicos(){
        return medH;
    }
    public Enfermero[] obtenerEnfermeros(){
        return enfH;
    }
    public double obtenerSueldo(){
        return sueldoH;
    }
    public String obtenerDir(){
        return dirH;
    }
    
    
    
    
    @Override
    public String toString(){
        String cadena = "sd";
        return cadena;
    }
    
}
