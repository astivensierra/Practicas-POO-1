package P4.Principal;

import P4.Triangulo.Triangulo;

public class Principal{
        
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(22.5, 9.6);
        System.out.println("Base: " + triangulo.getBase() + " Altura: " + triangulo.getAltura());
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Longitud de los lados: " + triangulo.calcularLados());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Vértice: " + triangulo.calcularVertice());
    }
            
}