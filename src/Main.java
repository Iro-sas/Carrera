import model.Coche;
import model.Carrera;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("BrumBrum", "Alguno", "123456", 99, 200);
        Coche coche2 = new Coche("Terrenaitor", "Fotorama", "C0CH3", 101, 300 );

        Carrera carrera = new Carrera(coche1, coche2, 500, 60);
        carrera.iniciarCarrera();
    }
}
