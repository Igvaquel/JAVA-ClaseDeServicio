/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class NIFService {
    Scanner leer = new Scanner(System.in);
    
     
    public NIF crearNif(){
        
        System.out.println("Ingresa el DNI:");
        long dni = leer.nextLong();
        char[] nifLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        
        long porcentaje = 23;
        long calcularNif = dni % porcentaje;
        
        char letra = nifLetra[(int)calcularNif];
        
        return new NIF(dni, letra);
    }
    
    public void mostrarNIF(NIF n1) {
        long dni = n1.getDni();
        
        char letra = n1.getLetra();

        System.out.println(dni + "-" + letra);
    }
}
