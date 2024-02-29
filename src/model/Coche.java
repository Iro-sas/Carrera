package model;

public class Coche {
    //siempre privado dentro//
    private String marca;
    private String modelo;
    private String matricula;
    private int cv;
    private int cc;
    private double velocidad;
    private double kmRecorridos;

    public Coche (String marca, String modelo,String matricula, int cv, int cc) {
        //no hace falta añadir velocidad y km por algun motivo
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
        this.velocidad = 0;
        this.kmRecorridos = 0;
    }

    public void acelerar(double velocidadAcelerar) {
        if (velocidadAcelerar < 10) {
            velocidadAcelerar = 10;
        }
        velocidad = velocidad + velocidadAcelerar;
        kmRecorridos += 0.5 * velocidadAcelerar;
        //+= es lo mismo que velocidad = velocidad + velocidadAcelerar, usar más
    }

    public String getMatricula() {
        return matricula;
    }
    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void mostrarDatos() {
        System.out.println("Datos del Coche:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Kilómetros Recorridos: " + kmRecorridos + " km");
    }


}
