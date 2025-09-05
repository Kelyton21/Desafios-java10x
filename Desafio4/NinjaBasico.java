package Desafios.Desafio4;

import Desafios.Desafio4.enums.TipoHabilidade;

public class NinjaBasico implements Ninja{
    protected String nome;
    protected int idade;
    protected TipoHabilidade habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome +  "\nIdade: " + idade + "\nHabilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habiliade - " + habilidade + " - Ativado");
    }
}
