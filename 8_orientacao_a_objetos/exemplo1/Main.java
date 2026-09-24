public class Main {
    public static void main(String[] args){
        Personagem persona = new Personagem();
        persona.nome = "Lula";
        persona.idade = 80;
        persona.poder = 13;

        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
    }
}
