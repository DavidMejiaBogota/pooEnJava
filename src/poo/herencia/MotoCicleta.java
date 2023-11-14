package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;
//Clase derivada o calse hija o subclase de Vehiculo.
public class MotoCicleta extends Vehiculo {
    //1. Atributos
    boolean baul;

    //2.Constructores
    public MotoCicleta(){}//Constructor vacío

    public MotoCicleta(String fabricante, String modelo, double cc, int year, String color, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, color, sport, speed, motor);
        this.baul = baul;
    }
}
