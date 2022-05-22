/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;
import paquete01.Enfermero;
import paquete01.Hospital;
import paquete01.Medico;

/**
 *
 * @author SALA I
 */
public class Principal {
     public static void main(String[] args) {
        String nombreH = hospital();
        String dirH = hospitalD();
        String ciudadH = ciudad();
        String provH = prov();
        int numMed = numeroMedicos();
        int numEnf = numeroEnfermeros();
        
        Medico[] m = new Medico[numMed];
        Enfermero[] e = new Enfermero[numEnf];
        Ciudad c = new Ciudad(ciudadH,provH);
        
        
         for (int i = 0; i < m.length; i++) {
             m[i] = new Medico(nomMed(i), especialidad(i), sueldo(i));
         }
         for (int i = 0; i < e.length; i++) {
             e[i] = new Enfermero(nomEnf(i), nombramiento(i), sueldoE(i));
         }
        
        
        Hospital h = new Hospital(nombreH, c, m , e,dirH);
        
        h.establecerEspecialidades();
        h.establecerSueldo();
        
        System.out.printf("\n%s\n",h);
    }
     
     
     public static int numeroMedicos(){
         Scanner leer = new Scanner(System.in);
         int n =0;
         System.out.print("Ingrese el número de medicos del hospital: ");
         n = leer.nextInt();
         System.out.println(" ");
         return n;
     }
     public static int numeroEnfermeros(){
         Scanner leer = new Scanner(System.in);
         int n =0;
         System.out.print("Ingrese el número de enfermeros del hospital: ");
         n = leer.nextInt();
         System.out.println(" ");
         return n;
     }
     public static String hospital(){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese el nombre del Hospital: ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static String hospitalD(){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese la dirrección del Hospital: ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static String ciudad(){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese la ciudad donde se encuentra el Hospital: ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static String prov(){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese la provincia deonde se encuentra el Hospital: ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     //info Medicos
     public static String nomMed(int i){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese el nombre del Medico "+(i+1)+" : ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static String especialidad(int i){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese la especialidad del Medico "+(i+1)+" : ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static double sueldo(int i){
         Scanner leer = new Scanner(System.in);
         leer.useLocale(Locale.US);
         double n = 0;
         System.out.print("Ingrese el sueldo del Medico "+(i+1)+" : ");
         n = leer.nextDouble();
         System.out.println(" ");
         return n;
     }
     //enfermeros
     public static String nomEnf(int i){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese el nombre del enfermero(ra) "+(i+1)+" : ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static String nombramiento(int i){
         Scanner leer = new Scanner(System.in);
         String n = "null";
         System.out.print("Ingrese el tipo contrato del enfermero(ra) "+(i+1)+" : ");
         n = leer.nextLine();
         System.out.println(" ");
         return n;
     }
     public static double sueldoE(int i){
         Scanner leer = new Scanner(System.in);
         leer.useLocale(Locale.US);
         double n = 0;
         System.out.print("Ingrese el sueldo del enfermero(ra) "+(i+1)+" : ");
         n = leer.nextDouble();
         System.out.println(" ");
         return n;
     }
     
}
