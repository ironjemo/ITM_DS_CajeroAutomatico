package Abstraccion;

public class DispensadorDe10000 extends ClaseabstractaDispensadorBilletes {

     int cantidad; // Declarar la variable cantidad
     int can10000 = 0; // Declarar la variable can10000

     @Override
     public void ejecutar(int cantidad) {
          while (cantidad >= 10000) {
               can10000++;
               cantidad = cantidad - 10000;
          }
          if (cantidad != 0 && sig != null) {
               sig.ejecutar(cantidad);
          }
          System.out.println("Entregando " + can10000 + " Billetes de 10000");
     }

}
