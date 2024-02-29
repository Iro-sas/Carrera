package model;

public class Carrera {
    // como funciona? "Coche coche1" significa que coche1 es una variable de la clase Carrera
    // y su tipo es Coche. esto es asociación entre clases. La clase Carrera tiene una relación con la clase Coche,
    // y la variable coche1 es una instancia de la clase Coche
    private Coche coche1;
    private Coche coche2;
    private double kmTotales;
    private int vueltas;

    public Carrera(Coche coche1, Coche coche2, double kmTotales, int vueltas) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.kmTotales = kmTotales;
        this.vueltas = vueltas;
    }

    public void iniciarCarrera() {
        System.out.println("Empieza la carrera ");
        coche1.mostrarDatos();
        coche2.mostrarDatos();

        for (int i = 1; i <= vueltas; i++) {
            System.out.println("=== vuelta " + i + " ===");
            coche1.acelerar(Math.random() * 30);
            coche2.acelerar(Math.random() * 30);

            coche1.mostrarDatos();
            coche2.mostrarDatos();

            if (coche1.getKmRecorridos() >= kmTotales || coche2.getKmRecorridos() >= kmTotales) {
                determinarGanador();
                break;
                //hay que poner break?
            }
        }

        if (coche1.getKmRecorridos() < kmTotales && coche2.getKmRecorridos() < kmTotales) {
            System.out.println("hay que dar mas vueltas.");
        }
    }

    private void determinarGanador() {
        Coche ganador = coche1.getKmRecorridos() > coche2.getKmRecorridos() ? coche1 : coche2;
        System.out.println("gana el coche con matrícula " + ganador.getMatricula() + "!");
    }
}
