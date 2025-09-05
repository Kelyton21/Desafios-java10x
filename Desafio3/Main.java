package Desafios.Desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Ninja> ninjas = new ArrayList<>();
        int opcao;
        String nome;
        int idade;
        String missao;
        String nivelDificuldade;
        String status;
        Senju ninja1 = new Senju();
        do {
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();
        switch (opcao){

            case 1:
                System.out.println("\n===== Clas Ninjas =====");
                System.out.println("1. Senju");
                System.out.println("2. Uchiha");
                System.out.println("3. Namikaze");
                System.out.print("Escolha uma opção: ");
                int op = entrada.nextInt();
                entrada.nextLine();
                switch (op) {
                    case 1:
                        System.out.print("Nome: ");
                        nome = entrada.nextLine();
                        System.out.print("Idade: ");
                        idade = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Missao: ");
                        missao = entrada.nextLine();
                        System.out.print("Nivel de dificuldade: ");
                        nivelDificuldade = entrada.nextLine();
                        System.out.print("Status da missao: ");
                        status = entrada.nextLine();
                        ninja1 = new Senju(nome, idade, missao, nivelDificuldade, status);
                        ninjas.add(ninja1);
                        System.out.println("Ninja salvo.");
                        break;
                    case 2: // Uchiha
                        break;
                    case 3: // Namikaze
                        break;
                    }
                    break;
            case 2:
                if (ninjas.isEmpty()){
                    System.out.println("Nenhum ninja salvo");
                }
                for (Ninja n: ninjas) {
                    n.mostrarInformacoes();
                    System.out.println("---------------------------");
                }
                break;
            case 3:
                System.out.println("Fim do programa...");
                break;
            default:
                break;
            }
        }while (opcao != 3);
    }
}
