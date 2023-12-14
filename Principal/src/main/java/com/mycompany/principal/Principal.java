/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Erick Arias
 */
public class Principal {

    public static void main(String[] args) {
        
    }
        public class Vehiculos {
    public String marca;
    public String modelo;
    public int año;

    public Vehiculos(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public void conducir() {
        System.out.println("El vehículo está siendo conducido...");
    }
    
    public void frenar() {
        System.out.println("El vehículo ha frenado.");
    }
    }

public class Moto extends Vehiculos {
    public int cilindrada;
    public String tipoMoto;

    public Moto(String marca, String modelo, int año, int kilometraje, int cilindrada, 
                String tipoMoto) {
        super(marca, modelo, año, kilometraje);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }
    
    public void caballito() {
        System.out.println("La moto está haciendo un caballito.");
    }
    
    public void saltarRampa() {
        System.out.println("La moto está saltando una rampa.");
    }
}

public class Carro extends Vehiculos {
    public int numPuertas;
    public String color;

    public Carro(String marca, String modelo, int año, int kilometraje, int numPuertas, 
                 String color) {
        super(marca, modelo, año, kilometraje);
        this.numPuertas = numPuertas;
        this.color = color;
    }
    
    public void acelerar() {
        System.out.println("El carro está acelerando.");
    }
    
    public void tocarBocina() {
        System.out.println("El carro está tocando la bocina.");
    }
}
        
    }

 