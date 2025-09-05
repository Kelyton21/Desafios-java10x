package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente b1 = new ContaCorrente("Joao",100.0,TipoConta.CORRENTE);
        ContaPoupanca b2 = new ContaPoupanca("Renan",70,TipoConta.POUPANCA);
        System.out.println(b2);
        b1.depositar(b2,30);
        System.out.println(b2);
    }
}
