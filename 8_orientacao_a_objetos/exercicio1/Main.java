public class Main {

    public static void main(String[] args){
        Carro car = new Carro();
        car.marca = "Hyundai";
        car.modelo = "HB20";
        car.combustivel = 50;
        car.cor = "Prata";

        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.combustivel);
        System.out.println(car.cor);
        car.ligarMotor();
        car.desligarMotor();
    }
}
