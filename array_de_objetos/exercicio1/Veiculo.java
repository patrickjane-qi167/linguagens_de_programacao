package array_de_objetos.exercicio1;

public class Veiculo {
  int velocidade = 0;

  public Veiculo (int velocidade) { 
    this.velocidade = velocidade; 
  }

  public static void main(String[] args) {
    Veiculo carro = new Veiculo(100);
    System.out.println(carro.velocidade);
  }
}