package P2.Principal;

import P2.Ventes.Ventas;

public class Principal {
    public static void main(String[] args) {
        double[] ventasMensuales = { 98343.0, 98343.0, 64835.0, 37863.0, 10394.0, 25724.0, 98734.0, 93754.0, 98534.0, 53435.0, 76374.0, 62624.0 };
        Ventas informe = new Ventas(ventasMensuales);
        System.out.println("Promedio de ventas anuales: " + informe.ventAnual());
        System.out.println("Mes con menos ventas: " + (informe.menosVentas() ));
        System.out.println("Mes con más ventas: " + (informe.masVentas() ));
        System.out.println("Acumulado de ventas anuales: " + informe.totalAnuales());
    }
}
