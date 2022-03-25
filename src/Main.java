import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mounstruos Sully = new Mounstruos(
                "Sully",
                1000,
                4,
                true,
                false,
                "Azul",
                new ArrayList<>(Arrays.asList("Carismatico","Alto","Fuerte Rugido")));

        Chamacos Boo = new Chamacos(
                "Boo",
                0.50,
                20,
                "Blanca con flores rosas");

        Boo.reir();
        Sully.trabajar();
    }
}
