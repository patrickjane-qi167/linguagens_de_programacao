public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Patrick";
        p.setIdade(18);
    
    System.out.println(p.nome);
    System.out.println(p.getIdade());
    }
}