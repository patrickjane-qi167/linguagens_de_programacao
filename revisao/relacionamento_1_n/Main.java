package revisao.relacionamento_1_n;

import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professor = new ArrayList<>();
    public static void main(String[] args) {
        professor.add(new Professor("Diogo"));
        professor.add(new Professor("Dirlei"));
        professor.add(new Professor("Wagner"));
        
        for(Professor prof : professor) {
            System.out.println("Nome: " + prof.getNome());
        }
    }
}