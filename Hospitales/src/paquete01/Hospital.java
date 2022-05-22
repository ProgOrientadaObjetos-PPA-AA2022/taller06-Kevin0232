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
public class Hospital {
    private String nombreH;
    private Ciudad ciudadH;
    private int especialidades;
    private Medico[] medH;
    private Enfermero[] enfH;
    private double sueldoH;
    private String dirH;
    
    public Hospital(String n, Ciudad c, Medico[] med, Enfermero[] enf, String dir){
        nombreH = n;
        ciudadH = c;
        medH = med;
        sueldoH =0;
        enfH = enf;
        dirH = dir;
    }
    
    
    // Establecer
    public void establecerNombre(String n){
        nombreH = n;
    }
    public void establecerCiudad(Ciudad c){
        ciudadH = c;
    }
    public void establecerEspecialidades(){
        especialidades = medH.length + enfH.length;
    }
    public void establecerMedicos(Medico[] m){
        medH = m;
    }
    public void establecerEnfermeros(Enfermero[] m){
        enfH = m;
    }
    public void establecerSueldo(){
        for (int i = 0; i < medH.length; i++) {;
            sueldoH += obtenerMedicos()[i].obtenerSueldo();
        }
        
        for (int i = 0; i < enfH.length; i++) {
            sueldoH += obtenerEnfermeros()[i].obtenerSueldo();
        }
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
        String cadena = String.format("Hospital %s\nDirección: %s\nCiudad: %s\nProvincia"
                + ": %s\nNúmero de especialidades: %s \nListado de médicos\n",obtenerNombre(),obtenerDir(),
                ciudadH.obtenerNombre(),ciudadH.obtenerProvincia(),obtenerEspecialidad());
        
        for (int i = 0; i < medH.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",cadena,medH[i].obtenerNombre()
                    ,medH[i].obtenerSueldo(),medH[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%sListado de Enfermeros(as)\n", cadena);
        for (int i = 0; i < enfH.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",cadena,enfH[i].obtenerNombre()
                    ,enfH[i].obtenerSueldo(),enfH[i].obtenerContrato());
        }
        
        cadena = String.format("%sTotal de sueldos a pagar por mes: %.2f\n",cadena,obtenerSueldo());
        return cadena;
    }
    
    
}
