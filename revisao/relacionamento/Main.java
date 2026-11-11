package revisao.relacionamento;

public class Main {
    private static Professor professor;
    public static void main(String[] args) {
        Professor prof = new Professor("Rosica");

        System.out.println("Nome " + prof.getNome());
    }
}