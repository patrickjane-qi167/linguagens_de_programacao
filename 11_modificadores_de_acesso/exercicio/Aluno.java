public class Aluno extends Pessoa{

    public Aluno(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public String profissao(){
        return "Ola, aluno";
    }
}