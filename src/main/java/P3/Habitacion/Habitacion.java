package P3.Habitacion;


public class Habitacion {
    private double largo;
    private double ancho;
    private double altura;

    public Habitacion(double largo, double ancho, double altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
   public double calcularPared(){
       
        double aux = 2 * altura * (largo + ancho);
        return aux;
      
    }
   
   public double calcularPiso(){
       
        return largo*ancho;
       
   }
}
