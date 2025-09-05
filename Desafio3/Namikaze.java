package Desafios.Desafio3;

public class Namikaze extends Ninja{
    private String habilidadeEspecial = "Hiraishin no Jutsu (Técnica do Deus Voador do Trovão)";

    public Namikaze(){}
    public Namikaze(String nome, int idade, String missao, String nivelDificuldae, String statusMissao){
        super(nome, idade, missao, nivelDificuldae, statusMissao);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade unica dos Namikaze: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}

