package revisao.relacionamento_1_n;

import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professor = ArrayList<>();
    public static void main(String[] args) {
        Professor.add(new.Professor("Diogo"));
        Professor.add(new.Professor("Dirlei"));
        Professor.add(new.Professor("Wagner"));

        for(Professor prof : professor) {
            System.out.println("Nome: " + prof.getNome());
        }
    }
}