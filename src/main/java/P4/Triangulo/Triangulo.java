package P4.Triangulo;


public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea() {
        return base * altura / 2;
    }
    
    public double calcularLados() {
        return Math.sqrt((altura * altura) + (base / 2 * base / 2));
    }
    
    public double calcularPerimetro() {
        return 2 * calcularLados() + base;
    }
    
    public double calcularVertice() {
        return Math.toDegrees(Math.atan2(base / 2, altura));
    }

    
}
