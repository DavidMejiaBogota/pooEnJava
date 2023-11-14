package poo.clases;

public class Motor {

    //1. Atributos
    protected String modelMotor;
    protected int caballos;
    protected double parNm;
    protected int numCilindros;

    //2. Constructores
    public Motor(){}//Constructor vacío

    public Motor(String modelMotor, int caballos, double parNm, int numCilindros) {
        this.modelMotor = modelMotor;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }

    //3. Métodos
}
