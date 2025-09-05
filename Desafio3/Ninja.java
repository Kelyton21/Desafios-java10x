package Desafios.Desafio3;

public class Ninja {
    protected String nome;
    protected int idade;
    protected String missao;
    protected String nivelDificuldae;
    protected String statusMissao;

    public Ninja(){}

    public Ninja(String nome, int idade, String missao, String nivelDificuldae, String statusMissao){
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldae = nivelDificuldae;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do ninja: " + nome +
        " - Idade: " + idade +
        " - Missao: " + missao + " - Nivel de Dificuldade: " + nivelDificuldae + " - Status da Missao: " + statusMissao);
    }

}
