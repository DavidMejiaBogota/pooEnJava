package poo.clases;
//Clase base o super clase o clase padre de las clases Coche, MotoCicleta, Camion.
public class Vehiculo {

    //1. atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected String color;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    //2. constructores
    public Vehiculo(){} //constructor vacío

    public Vehiculo(String fabricante, String modelo, double cc, int year, String color, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo ){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    //3. métodos (comportamientos)
    public void acelerar(int quantity){
        this.speed += quantity;
    }
}