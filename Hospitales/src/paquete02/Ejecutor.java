/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Enfermero;
import paquete01.Hospital;
import paquete01.Medico;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Medico[] m = new Medico[3];
        Enfermero[] e = new Enfermero[2];
        Ciudad c = new Ciudad("Loja","Loja");
        
        Medico med1 = new Medico("Juan Perez", "Neurocirujano", 1605.73);
        Medico med2 = new Medico("Sofia Rojas", "Pediatar", 1263.67);
        Medico med3 = new Medico("Pedro Picapiedra", "Cardiologo", 1892.82);
        
        m[0] = med1;
        m[1] = med2 ;
        m[2] = med3;
        
        Enfermero enf1 = new Enfermero("Aelin Galanthynius","suplente", 800.3);
        Enfermero enf2 = new Enfermero("Harry Potter","nombramiento", 1068.3);
        e[0] = enf1;
        e[1] = enf2;
        
        
        Hospital h = new Hospital("Mauricio", c, m , e,"24 de mayo y Miguel Riofrio");
        
        h.establecerEspecialidades();
        h.establecerSueldo();
        
        System.out.printf("\n%s\n",h);
        
    }
}
