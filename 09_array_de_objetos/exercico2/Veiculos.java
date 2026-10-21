public class Veiculos {
  int ano;
  String modelo;

  public Veiculos(String modelo) {
    this(2020, modelo);
  }

  public Veiculos(int ano, String modelo) {
    this.ano = ano;
    this.modelo = modelo;
  }

  public void printInfo() {
    System.out.println(ano + " " + modelo);
  }

  public static void main(String[] args) {
    Veiculos car1 = new Veiculos("Corvette");

    Veiculos car2 = new Veiculos(1969, "Mustang");

    car1.printInfo();
    car2.printInfo();
  }
}