package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.MotoCicleta;

public class Main {

    public static void main(String[] args) {
        //1. Clases y objetos

        //Crear un objeto con el constructor vació:
        Vehiculo toyotaPrius = new Vehiculo();

        //Crear un Motor para poder crear vehículos
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        //Crear un objeto utilizando el constructor con parametros
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.4, 2004, "blue", false, 0, motorGTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.cc);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.color);
        System.out.println(fordMondeo.sport);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(20);
        System.out.println(fordMondeo.speed);

        //2. Herancia
        MotoCicleta kawasakiNinja = new MotoCicleta();
        kawasakiNinja.fabricante = "Kawasaki";


        System.out.println("Fin de programa");

        //3. Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new MotoCicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(70);

        vehiculo = new Camion();
        vehiculo.acelerar(90);

        //4. Clases abstractas: no se pueden instanciar(crear objetos), solo instancia las clases hijas.

    }
}
