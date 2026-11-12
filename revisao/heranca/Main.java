package revisao.heranca;

import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professores = new ArrayList<>();
    private static List<Alunos> alunos = new ArrayList<>();
    public static void main(String[] args) {
        professores.add(new Professor("Diogo"));
        professores.add(new Professor("Andrea"));
        professores.add(new Professor("Thais"));

        alunos.add(new Alunos("Goku"));
        alunos.add(new Alunos("Vegeta"));
        alunos.add(new Alunos("Kuririn"));

        for (Professor prof : professores) {
            System.out.println("Nome: " + prof.getNome());
        }

        for (Alunos aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
        }
    }
    
}
