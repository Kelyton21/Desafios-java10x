package Desafios.Desafio3;

public class Uchiha extends Ninja{
    private String habilidadeEspecial = "Mangekyou Sharingan";

    public Uchiha(){}
    public Uchiha(String nome, int idade, String missao, String nivelDificuldae, String statusMissao){
        super(nome, idade, missao, nivelDificuldae, statusMissao);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade unica dos Uchiha: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
