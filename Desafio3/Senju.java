package Desafios.Desafio3;

public class Senju extends Ninja{
    private String habilidadeEspecial = "Mokuton (Estilo Madeira)";

    public Senju(){}
    public Senju(String nome, int idade, String missao, String nivelDificuldae, String statusMissao){
        super(nome, idade, missao, nivelDificuldae, statusMissao);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade unica dos Senju: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
