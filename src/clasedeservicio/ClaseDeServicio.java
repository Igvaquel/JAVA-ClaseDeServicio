/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedeservicio;

import Servicios.CafeteraServicio;
import Servicios.CuentaBancariaServicio;
import Servicios.NIFService;
import Servicios.PersonaServicio;
import Servicios.RaicesServicio;
import entidades.Cafetera;
import entidades.CuentaBancaria;
import entidades.NIF;
import entidades.Persona;
import entidades.Raices;

/**
 *
 * @author Pepo
 */
public class ClaseDeServicio {

   
    public static void main(String[] args) {
        
        /*EJ1
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        
        CuentaBancaria c1 = servicio.crearCuenta();
        
        servicio.ingresar(c1);
        
        servicio.retirar(c1);
        
        servicio.extraccionRapida(c1);
        
        servicio.consultarDatos(c1);*/
        
        /*EJ2
        CafeteraServicio servicio = new CafeteraServicio();
        
        Cafetera uno = servicio.recibirCafetera();
        
        servicio.llenarCafetera(uno);
        servicio.servirTaza(uno);
        servicio.vaciarCafetera(uno);
        servicio.agregarCafe(uno);*/
        
        /*EJ3
        PersonaServicio servicio = new PersonaServicio();

        Persona uno = new Persona("Juan", 25, 'H', 70, 1.78, "Castaño");
        Persona dos = new Persona("Maria", 25, 'M', 90, 1.50, "Rubio");
        Persona tres = new Persona("pedro", 17, 'H', 60, 1.60, "Rubio");
        Persona cuatro = new Persona("Sofia", 25, 'M', 70, 1.90, "Rojo");       

        double[] imc ={servicio.calcularIMC(uno),servicio.calcularIMC(dos),servicio.calcularIMC(tres),servicio.calcularIMC(cuatro)};
        boolean[] edad = {servicio.esMayorDeEdad(uno),servicio.esMayorDeEdad(dos),servicio.esMayorDeEdad(tres),servicio.esMayorDeEdad(cuatro)};
        
        System.out.println(edad[2]);
        
        servicio.porcetanjeEdad(edad);
        servicio.porcentajeImc(imc);*/
        
        /*EJEX1
        Raices raices = new Raices(2, -5, 6);
        RaicesServicio servicio = new RaicesServicio(raices);
        
        System.out.println("Discriminante: " + servicio.getDiscriminante());
        System.out.println("Tiene dos raíces: " + servicio.tieneRaices());
        System.out.println("Tiene una única raíz: " + servicio.tieneRaiz());
        servicio.calcular();*/
        
        /*EJEX2
        NIF n1 = new NIF();
        NIFService servicio = new NIFService();
        
        n1 = servicio.crearNif();
        servicio.mostrarNIF(n1);*/
    }
}
