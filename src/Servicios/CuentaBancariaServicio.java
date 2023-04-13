/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
            
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese el numero de dni");
        long dniCliente = leer.nextLong();
        
        System.out.println("Ingrese el saldo de la cuenta");
        int saldoActual = leer.nextInt();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
           
    }
    
    public void ingresar(CuentaBancaria cuenta){
        System.out.println("Ingrese la cantidad de dinero que quiere ingresar");
        double suma = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual()+suma);
        System.out.println("Se ha ingresado: "+suma+" a tu cuenta y su saldo es de: "+cuenta.getSaldoActual() );
    }
    
    public void retirar(CuentaBancaria cuenta){
        System.out.println("Ingrese la cantidad de dinero que quiere retirar");
        double resta = leer.nextDouble();
        
        if(resta>cuenta.getSaldoActual()){
            System.out.println("El saldo no es suficiente, usted a retirado: "+cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-resta);
            System.out.println("Usted retira: "+resta+ " y su saldo es de: "+cuenta.getSaldoActual());
        }
        
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        System.out.println("Ingrese la cantidad a retirar, recuerde que en extraccion rapida solo puede retirar hasta el 20% del total de su cuenta");
        double resta = leer.nextDouble();
        
        if(resta>(cuenta.getSaldoActual()*0.20)){
            System.out.println("Recuerde que solo puede retirar hasta 20% del total de su cuenta");
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-resta);
            System.out.println("Usted retira: "+resta+ "y su saldo es de: "+cuenta.getSaldoActual());;
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
       System.out.println("Su saldo actual es de: "+cuenta.getSaldoActual()); 
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
       System.out.println("Su numero de cuenta es de : "+cuenta.getNumeroCuenta()); 
       System.out.println("El dni con que se registro la cuenta es : "+cuenta.getDniCliente()); 
       System.out.println("Su saldo actual es de: "+cuenta.getSaldoActual()); 
        
    }

    
    
    
}
