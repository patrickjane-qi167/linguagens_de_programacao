public class Main {
    public static void main(String[] args){
        Aluno aluninho = new Aluno("Alberto", 16);
        Professor profe = new Professor(26, "Roberto");
        Diretor direta = new Diretor("Humberto", 66);

        System.err.println(profe.nome + " falou " + direta.profissao());
        System.err.println(aluninho.nome + " falou " + profe.profissao());
        System.err.println(direta.nome + " falou " + aluninho.profissao());
    }
}