package Desafios.Desafio4;

import Desafios.Desafio4.enums.TipoHabilidade;

public class Main {
    public static void main(String[] args) {
        Ninja nb = new NinjaBasico("Joao",12,TipoHabilidade.valueOf("TAIJUTSU"));
        Ninja na = new NinjaAvancado("Renan",15,TipoHabilidade.valueOf("GENJUTSU"),"Mente que nem treme");
        nb.mostrarInformacoes();
        System.out.println("-----------------------");
        na.mostrarInformacoes();
    }
}
