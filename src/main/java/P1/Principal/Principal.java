package P1.Principal;

import P1.Auto.Auto;

public class Principal {
    public static void main(String[] args) {
       
        Auto A1 = new Auto("Morado", "Toyota", "Supra", 450, 4, "RCV973");
        System.out.println(A1.toString());
        
        
        A1.setColor("Verde");
        A1.setPuertas(2);
        System.out.println(A1.toString());
        
       
        Auto A2 = new Auto("Negro", "Chevrolet", "Camaro", 200, 4, "DSF876");
        System.out.println(A2.toString());
    }
}