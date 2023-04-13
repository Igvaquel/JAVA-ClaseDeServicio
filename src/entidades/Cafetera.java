/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Pepo
 */
public class Cafetera {
    private int capacidadMáxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMáxima, int cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
