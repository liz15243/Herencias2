public class Personajes {
    //nombre
    //estatura
    //peso

    protected String nombre;
    protected double peso;
    protected  double altura;

    public Personajes(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        System.out.println("Soy el constructor Padre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //dormir
    //comer
    //pensar
    public void dormir (){
        System.out.println("Durmiendo");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void pensar(){
        System.out.println("Pensando");
    }
}
