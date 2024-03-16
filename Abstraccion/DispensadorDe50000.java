package Abstraccion;

public class DispensadorDe50000 extends ClaseabstractaDispensadorBilletes {

    int cantidad; // Declarar la variable cantidad
    int can50000 = 0; // Declarar e inicializa la variable can50000

    @Override
    public void ejecutar(int cantidad) {
        this.cantidad = cantidad;

        while (this.cantidad >= 50000) {
            can50000++;
            this.cantidad = this.cantidad - 50000;
        }

        if (this.cantidad != 0 && sig != null) {
            sig.ejecutar(this.cantidad);
        }

        System.out.println("Entregando " + can50000 + " Billetes de 50000");
    }
}
