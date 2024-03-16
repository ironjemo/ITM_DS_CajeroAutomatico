 package Abstraccion;

 public class DispensadorError extends ClaseabstractaDispensadorBilletes{

    public DispensadorError(){}
       

    @Override
    public  void ejecutar(int cantidad) {
        if (cantidad%5000 == 0) {
            
            if (sig != null) {
               sig.ejecutar(cantidad);
            }
        }
        
        else{
          System.out.println("El cajero entrega multiplos de 5000");
        }
    }
}
    

