public class Chamacos extends Personajes{


    //Color puerta
    private String colorPuerta;

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    public Chamacos(String nombre, double estatura, double opeso, String colorPuerta) {
        super(nombre, estatura, opeso);
        this.colorPuerta = colorPuerta;
        System.out.println("Estoy en el contructor de los Chamacos");
    }

    //Reir
    //Llorar
    public void reir(){
        System.out.println("Jajajajaja");
    }
    public void llorar(){
        System.out.println("pipipipipi");
    }



}
