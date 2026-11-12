package revisao.relacionamento_multiplos;

public class Aluno {
    public String nome;
    
    public Aluno(String nome){
        setNome(nome);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}