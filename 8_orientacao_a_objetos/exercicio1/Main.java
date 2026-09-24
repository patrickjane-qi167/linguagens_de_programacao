public class Main {

    public static void main(String[] args){
        Carro car = new Carro();
        car.marca = "Hyundai";
        car.modelo = "HB20";
        car.combustivel = 50;
        car.cor = "Prata";

        System.out.println("Característica");
        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.combustivel);
        System.out.println(car.cor);

        car.ligarMotor();
        car.desligarMotor();

        Moto moto = new Moto();
        moto.marca = "Yamaha";
        moto.modelo = "Fazer 250";
        moto.combustivel = 14.2;
        moto.cilindradas = 250;

        System.out.println("Característica");
        System.out.println(moto.marca);
        System.out.println(moto.modelo);
        System.out.println(moto.combustivel);
        System.out.println(moto.cilindradas);

        moto.ligarMotor();
        moto.desligarMotor();

        Balao balao = new Balao();
        balao.limite_pessoas = 2;

        System.out.println("Característica");
        System.out.println(balao.limite_pessoas);

        balao.acender();
        balao.subir();
        balao.descer();

        Helicoptero heli = new Helicoptero();
        heli.marca = "Bell";
        heli.modelo = "Bell 206";
        heli.ano = 2010;

        System.out.println("Característica");
        System.out.println(heli.marca);
        System.out.println(heli.modelo);
        System.out.println(heli.ano);

        heli.ligarMotor();
        heli.desligarMotor();
    }
}
