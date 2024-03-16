import java.util.Scanner;
import Abstraccion.DispensadorDe10000;
import Abstraccion.DispensadorDe100000;
import Abstraccion.DispensadorDe20000;
import Abstraccion.DispensadorDe50000;
import Abstraccion.DispensadorDe5000;
import Abstraccion.DispensadorError;

public class App {

  static int cantidad;
    
  public static void main(String[] args) throws Exception {

    Scanner leer=new Scanner(System.in);
    System.out.println("Inrgesa el monto que deseas retirar");
    cantidad = leer.nextInt();
       
    DispensadorDe100000 B100=new DispensadorDe100000();
    DispensadorDe50000 B50=new DispensadorDe50000();
    DispensadorDe20000 B20=new DispensadorDe20000(); 
    DispensadorDe10000 B10=new DispensadorDe10000(); 
    DispensadorDe5000 B5=new DispensadorDe5000(); 
    DispensadorError controladError=new DispensadorError();

    controladError.siguienteBillete(B100);
    B100.siguienteBillete(B50);
    B50.siguienteBillete(B20);
    B20.siguienteBillete(B10);
    B10.siguienteBillete(B5);
    controladError.ejecutar(cantidad);

    leer.close();   

   
  }
 
}
