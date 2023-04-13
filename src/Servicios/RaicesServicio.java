/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class RaicesServicio {
    private Raices raices;
    
    public RaicesServicio(Raices raices) {
        this.raices = raices;
    }
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    
    public double getDiscriminante(){        
        return Math.pow(raices.getB(), 2)-4*raices.getA()*raices.getC();
    }
    
    public boolean tieneRaices(){
        double discriminante = Math.pow(raices.getB(), 2)-(4*raices.getA()*raices.getC());
        
        return discriminante >= 0;
    }
    public boolean tieneRaiz(){
        double discriminante = Math.pow(raices.getB(), 2)-(4*raices.getA()*raices.getC());
        
        return discriminante == 0;
    }
    
    public void obtenerRaices(){
        if(tieneRaices()){
            double x1= (-raices.getB() + Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            double x2= (-raices.getB() - Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            System.out.println("Las posibles soluciones son: " + x1 + " y " + x2);
        }else{
            System.out.println("No tiene 2 posibles soluciones");
        }   
    }
    
    public void obtenerRaiz(){
        if(tieneRaiz()){
            double x= (-raices.getB() + Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            
            System.out.println("La unica solucion a la ecuacion es "+ x);
        } 
    }
    
    public void calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene solucion");
        }
    }
}
