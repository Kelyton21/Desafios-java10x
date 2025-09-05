package Desafios.Desafio4;

import Desafios.Desafio4.enums.TipoHabilidade;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    private String especialidade;

    public NinjaAvancado(){
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade,String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome +  "\nIdade: " + idade + "\nHabilidade: " + habilidade + "\nEspecialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade especial: " + especialidade);
    }
}
