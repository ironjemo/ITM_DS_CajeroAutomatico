package Abstraccion;

//Abstraccion del Patron Bridge
public abstract class ClaseabstractaDispensadorBilletes implements Ietapas {

  protected ClaseabstractaDispensadorBilletes sig;

  abstract public void ejecutar(int cantidad);

  public void siguienteBillete(ClaseabstractaDispensadorBilletes sig) {
    this.sig = sig;
  }

}