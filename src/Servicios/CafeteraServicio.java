/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera recibirCafetera(){
        System.out.println("Ingrese la cantidad maxima de la cafetera(en ml)");
        int capacidadMáxima = leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual de la cafetera(en ml)");
        int cantidadActual = leer.nextInt();
        
        return new Cafetera(capacidadMáxima,cantidadActual);
    }
    
    public void llenarCafetera(Cafetera cuenta){
        cuenta.setCantidadActual(cuenta.getCapacidadMáxima());
    }
    
    public void servirTaza(Cafetera cuenta){
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        
        if(taza>cuenta.getCantidadActual()){
            System.out.println("la taza no se lleno por completo, se sirvio: "+cuenta.getCantidadActual());
            cuenta.setCantidadActual(0);
        }else{
            cuenta.setCantidadActual(cuenta.getCantidadActual()-taza);
            System.out.println("Se lleno la taza por completo y a la maquina le queda: "+cuenta.getCantidadActual());
        }
    }
    
    public void vaciarCafetera(Cafetera cuenta){
        cuenta.setCantidadActual(0);
        System.out.println("Se vacio la cafetara");
    }
    
    public void agregarCafe(Cafetera cuenta){
        System.out.println("Ingrese la cantidad de cafe a agregar");
        int suma = leer.nextInt();
        if((suma+cuenta.getCantidadActual())>cuenta.getCapacidadMáxima()){
            System.out.println("La cafetera se lleno y excede la capacidad maxima");
            cuenta.setCantidadActual(cuenta.getCapacidadMáxima());
        }else{
            cuenta.setCantidadActual(cuenta.getCantidadActual()+suma);
        }
    }
}
