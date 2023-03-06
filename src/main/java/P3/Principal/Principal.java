package P3.Principal;

import P3.Habitacion.Habitacion;


public class Principal {
   
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion(8.9, 6.5, 3.0);
        double Piso = habitacion.calcularPiso();
        double Paredes = habitacion.calcularPared();
        
        System.out.println("Las medidas de la habitación son: " + habitacion.getLargo() + "m x " + habitacion.getAncho() + "m x " + habitacion.getAltura() + "m");
        System.out.println("Metros cuadrados para el enchape del piso: " + Piso + "m²");
        System.out.println("Metros cuadrados para tapizar las paredes: " + Paredes + "m²");
    }


}
