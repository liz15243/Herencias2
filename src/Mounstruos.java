import java.util.ArrayList;

//Extends llamar clase Padre
public class Mounstruos extends Personajes{

    public Mounstruos(String nombre, double peso, double altura) {
        super(nombre, peso, altura);
    }
    private boolean cuernos;
    private boolean tentaculos;
    private String color;
    private ArrayList<String> habilidades;

    public boolean isCuernos() {
        return cuernos;
    }

    public void setCuernos(boolean cuernos) {
        this.cuernos = cuernos;
    }

    public boolean isTentaculos() {
        return tentaculos;
    }

    public void setTentaculos(boolean tentaculos) {
        this.tentaculos = tentaculos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Mounstruos(String nombre, double peso, double altura, boolean cuernos, boolean tentaculos, String color, ArrayList<String> habilidades) {
        super(nombre, peso, altura);
        this.cuernos = cuernos;
        this.tentaculos = tentaculos;
        this.color = color;
        this.habilidades = habilidades;
        System.out.println("Soy el constructor hijo");
    }

    //Espantar
    //Trabajar
    //Reir

    public void espantar() {
        System.out.println("boooo!");
    }

    public void trabajar() {
        System.out.println("Venga hay que hacer muchos gritos");
    }
    public void reir(){
        System.out.println("Pon esa cosa horrorosa ahi Bom Bom Bom");
    }
}
