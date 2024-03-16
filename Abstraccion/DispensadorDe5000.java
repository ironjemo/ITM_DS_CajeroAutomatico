package Abstraccion;

public class DispensadorDe5000 extends ClaseabstractaDispensadorBilletes {
    public int cantidad;
    public int can5000 = 0;

    @Override
    public void ejecutar(int cantidad) {
        this.cantidad = cantidad;

        while (this.cantidad >= 5000) {
            can5000++;
            this.cantidad = this.cantidad - 5000;
        }

        if (this.cantidad != 0 && sig != null) {
            sig.ejecutar(this.cantidad);
        }

        System.out.println("Entregando " + can5000 + " Billetes de 5000");
    }
}
