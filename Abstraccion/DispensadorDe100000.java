package Abstraccion;

public class DispensadorDe100000 extends ClaseabstractaDispensadorBilletes {
   public int cantidad;
   public int can100000 = 0; // Declarar e inicializa la variable can100000

   @Override
   public void ejecutar(int cantidad) {
      this.cantidad = cantidad;

      while (this.cantidad >= 100000) {
         can100000++;
         this.cantidad = this.cantidad - 100000;
      }

      if (this.cantidad != 0 && sig != null) {
         sig.ejecutar(this.cantidad);
      }

      System.out.println("Entregando " + can100000 + " Billetes de 100000");
   }
}
