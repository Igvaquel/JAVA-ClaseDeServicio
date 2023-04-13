/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre completo");
        String nombre = leer.next();
        
        System.out.println("Ingrese su edad");
        double edad = leer.nextDouble();
        
        System.out.print("Ingrese su sexo(M,F,O)");
        char sexo = leer.next().charAt(0);
        
        while(sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo incorrecto. Ingrese el sexo (H/M/O): ");
            sexo = leer.nextLine().charAt(0);
        }
        System.out.println("Ingrese su peso en kg");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese su altura en m");
        double altura = leer.nextDouble();
        
        System.out.println("Ingrese su color de pelo");
        String colorDePelo = leer.next();
                
        return new Persona(nombre,edad,sexo,peso,altura,colorDePelo);
    }
    
    public boolean esMayorDeEdad(Persona cuenta){
        return cuenta.getEdad() >= 18;
    }
    
    public int calcularIMC(Persona cuenta){
        double imc = cuenta.getPeso() / Math.pow(cuenta.getAltura(), 2);
        if(imc < 20){
            return -1;
        }else if(imc>= 20 && imc<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public void porcetanjeEdad(boolean[] arreglo){
        int mayor=0;
        int menor=0;
        int total= arreglo.length;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==true){
                mayor+=1;
            }else{
                menor+=1;
            }
        }
        
        System.out.println("El porcentaje de mayores es de "+(mayor*100 / total)+ " y el porcentaje de menores es de "+(menor*100 / total));
    }
    
    public void porcentajeImc(double[] arreglo){
        int bajo=0;
        int ideal=0;
        int alto=0;
        int total= arreglo.length;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==-1){
                bajo+=1;
            }else if(arreglo[i]==0){
                ideal+=1;
            }else{
                alto+=1;
            }
        }
        
        System.out.println("Porcentaje de personas por debajo de su peso: " + (bajo * 100 / total) + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + (ideal * 100 / total) + "%");
        System.out.println("Porcentaje de personas por encima de su peso: " + (alto * 100 / total) + "%");
    }
    
}
