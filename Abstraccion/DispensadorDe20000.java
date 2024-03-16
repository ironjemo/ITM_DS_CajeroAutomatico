package Abstraccion;

public class DispensadorDe20000 extends ClaseabstractaDispensadorBilletes {

    int cantidad; // Declarar la variable cantidad
    int can20000 = 0; // Declarar e inicializa la variable can20000

    @Override

    public void ejecutar(int cantidad) {
        while (cantidad >= 20000) {
            can20000++;
            cantidad = cantidad - 20000;
        }

        if (cantidad != 0 && sig != null) {
            sig.ejecutar(cantidad);
        }

        System.out.println("Entregando " + can20000 + " Billetes de 20000");
    }

}
